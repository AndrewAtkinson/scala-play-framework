package controllers

import javax.inject.Inject
import play.api.data.Form
import play.api.db
import play.api.mvc._
import play.api.data.Forms
import play.api.data.Forms._
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json._
import play.api.data.validation.Constraints
import scala.concurrent.Future
import models.User

import reactivemongo.api.Cursor
import play.modules.reactivemongo.MongoController
import play.modules.reactivemongo.ReactiveMongoApi
import play.modules.reactivemongo.ReactiveMongoComponents
import play.modules.reactivemongo.json._
import play.modules.reactivemongo.json.collection._

/**
 * User controller containing all of the functions for adding, listing and searching users
 *
 * @param reactiveMongoApi
 * @author Andrew Atkinson
 */


class User_Controller @Inject()(val reactiveMongoApi: ReactiveMongoApi)
  extends Controller with MongoController with ReactiveMongoComponents {

  def user_collection: JSONCollection = db.collection[JSONCollection]("users") //users collection

  val user_form = Form(
    mapping(
      "name" -> nonEmptyText,
      "email" -> email
    //TODO verify email field and check they match
    //TODO check email is unique
    )(User.apply)(User.unapply)
  )

  /**
   * Method to return the index template
   * @return
   */
  def index = Action {
    Ok(views.html.index()) //display index template
  }

  /**
   * Method to return the add template
   * @return
   */
  def add(message: String = "") = Action {
    Ok(views.html.add_user(user_form, message)) // show add user template
  }

  /**
   * Method that takes two parameters converts them to json and inserts a record into users collection in Mongo DB
   * @param name
   * @param email
   * @return
   */
  def create_user(name: String, email: String) {
    val json = Json.obj(//create json object from parameters
      "name" -> name,
      "email" -> email)

    user_collection.insert(json) //TODO add check for insert and report error
  }

  /**
   * Method that allows a field and value to be searched for against the user collection in Mongo DB
   * Also returns all users if the value parameter is blank
   * @param value
   * @param field
   * @return
   */
  def find(value: String, field: String) = Action.async {

    val criteria = Json.obj(field -> Json.obj("$regex" -> (".*" + value + ".*"), "$options" -> "i"))

    val cursor: Cursor[JsObject] = user_collection.
      find(criteria). // set field and value to search for with wildcards to search for partial matches and case insensitive flag to find Andy and andy
      cursor[JsObject] // perform the query and get a cursor of JsObject

    val user_list: Future[List[JsObject]] = cursor.collect[List]() // convert object to list

    val user_array: Future[JsArray] =
      user_list.map { users => Json.arr(users) } //convert list into json array

    user_array.map { users =>
      Ok(users) //display array
    }
  }

  /**
   * Method that takes the form post and creates a user and then displays a message to the user
   * @return
   */
  def create = Action { implicit request =>

    user_form.bindFromRequest.fold(// validation function
      form_with_errors => {
        //has errors
        Logger.debug("Form validation failed.")
        BadRequest(views.html.add_user(form_with_errors, "failed")) // views.html.index()
      },
      user_data => {
        // validates
        val name = user_data.name
        val email = user_data.email
        create_user(user_data.name, user_data.email)
        Logger.info("User added: " + name + " " + email + " by IP:" + request.remoteAddress)
        Redirect(routes.User_Controller.add("success")) // redirect to add method with success message
      }
    )

  }
}