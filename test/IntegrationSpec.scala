import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test._

/**
 * add your integration spec here.
 * An integration test will fire up a whole play application in a real (or headless) browser
 */
@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends Specification {

  "Application" should {

    "work from within a browser" in new WithBrowser {

      browser.goTo("http://localhost:" + port)
      browser.pageSource must contain("Please Choose the an option from the menu.")
    }
    "add a new user from the browser" in new WithBrowser {

      browser.goTo("http://localhost:" + port + "/add") //go to add user page
      browser.fill("#name").`with`("Test User")//fill the name field with a test name
      browser.fill("#email").`with`("andy.atkinson@me.com")//fill the email with a email
      browser.submit("#user_form")//submit the form
      browser.pageSource must contain("The user was successfully added!")//check for text
    }
    "prevent an incorrect email from being added" in new WithBrowser { //TODO see why test does not pass

      browser.goTo("http://localhost:" + port + "/add") //go to add user page
      browser.fill("#name").`with`("Test User") //fill the name field with a test name
      browser.fill("#email").`with`("andy.atkinson@me") //fill the email with a bad email
      browser.submit("#user_form")//submit the form
      browser.pageSource must not contain("The user was successfully added!")//check the user was not added successfully
    }
    "prevent an empty email from being added" in new WithBrowser {

      browser.goTo("http://localhost:" + port + "/add") //go to add user page
      browser.fill("#name").`with`("Test User")//fill the name field with a test name
      browser.submit("#user_form")//submit the form
      browser.pageSource must contain("There was a problem and the user was not added.")//check for text
    }
    "prevent an empty name from being added" in new WithBrowser {

      browser.goTo("http://localhost:" + port + "/add") //go to add user page
      browser.fill("#email").`with`("andy.atkinson@me.com")//fill the email with a email
      browser.submit("#user_form") //submit the form
      browser.pageSource must contain("There was a problem and the user was not added.") //check for text
    }
    "list all users" in new WithBrowser { //TODO tests to make sure the api and search is working

    }

  }
}
