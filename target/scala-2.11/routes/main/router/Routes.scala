
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/andyatkinson/orange-bus-form/conf/routes
// @DATE:Mon Sep 07 21:14:49 BST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  User_Controller_1: controllers.User_Controller,
  // @LINE:18
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    User_Controller_1: controllers.User_Controller,
    // @LINE:18
    Assets_0: controllers.Assets
  ) = this(errorHandler, User_Controller_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, User_Controller_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.User_Controller.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.User_Controller.add(message:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.User_Controller.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.User_Controller.find(name:String, field:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/list""", """controllers.User_Controller.find(name:String ?= "", field:String ?= "name")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/find/name/$name<[^/]+>""", """controllers.User_Controller.find(name:String, field:String ?= "name")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/find/email/$name<[^/]+>""", """controllers.User_Controller.find(name:String, field:String ?= "email")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_User_Controller_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_User_Controller_index0_invoker = createInvoker(
    User_Controller_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User_Controller",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_User_Controller_add1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_User_Controller_add1_invoker = createInvoker(
    User_Controller_1.add(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User_Controller",
      "add",
      Seq(classOf[String]),
      "GET",
      """ User functions""",
      this.prefix + """add"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_User_Controller_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_User_Controller_create2_invoker = createInvoker(
    User_Controller_1.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User_Controller",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """create"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_User_Controller_find3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_User_Controller_find3_invoker = createInvoker(
    User_Controller_1.find(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User_Controller",
      "find",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_User_Controller_find4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/list")))
  )
  private[this] lazy val controllers_User_Controller_find4_invoker = createInvoker(
    User_Controller_1.find(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User_Controller",
      "find",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/list"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_User_Controller_find5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/find/name/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_Controller_find5_invoker = createInvoker(
    User_Controller_1.find(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User_Controller",
      "find",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/find/name/$name<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_User_Controller_find6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/find/email/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_User_Controller_find6_invoker = createInvoker(
    User_Controller_1.find(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User_Controller",
      "find",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/find/email/$name<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_User_Controller_index0_route(params) =>
      call { 
        controllers_User_Controller_index0_invoker.call(User_Controller_1.index)
      }
  
    // @LINE:9
    case controllers_User_Controller_add1_route(params) =>
      call(params.fromQuery[String]("message", Some(""))) { (message) =>
        controllers_User_Controller_add1_invoker.call(User_Controller_1.add(message))
      }
  
    // @LINE:10
    case controllers_User_Controller_create2_route(params) =>
      call { 
        controllers_User_Controller_create2_invoker.call(User_Controller_1.create)
      }
  
    // @LINE:11
    case controllers_User_Controller_find3_route(params) =>
      call(params.fromQuery[String]("name", None), params.fromQuery[String]("field", None)) { (name, field) =>
        controllers_User_Controller_find3_invoker.call(User_Controller_1.find(name, field))
      }
  
    // @LINE:13
    case controllers_User_Controller_find4_route(params) =>
      call(params.fromQuery[String]("name", Some("")), params.fromQuery[String]("field", Some("name"))) { (name, field) =>
        controllers_User_Controller_find4_invoker.call(User_Controller_1.find(name, field))
      }
  
    // @LINE:14
    case controllers_User_Controller_find5_route(params) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("field", Some("name"))) { (name, field) =>
        controllers_User_Controller_find5_invoker.call(User_Controller_1.find(name, field))
      }
  
    // @LINE:15
    case controllers_User_Controller_find6_route(params) =>
      call(params.fromPath[String]("name", None), params.fromQuery[String]("field", Some("email"))) { (name, field) =>
        controllers_User_Controller_find6_invoker.call(User_Controller_1.find(name, field))
      }
  
    // @LINE:18
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_0.versioned(path, file))
      }
  }
}