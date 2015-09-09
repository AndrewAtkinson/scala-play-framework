
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/andyatkinson/orange-bus-form/conf/routes
// @DATE:Mon Sep 07 21:14:49 BST 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseUser_Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def find(name:String, field:String): Call = {
    
      (name: @unchecked, field: @unchecked) match {
      
        // @LINE:11
        case (name, field)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "search" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("name", name)), Some(implicitly[QueryStringBindable[String]].unbind("field", field)))))
      
      }
    
    }
  
    // @LINE:10
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def add(message:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "add" + queryString(List(if(message == "") None else Some(implicitly[QueryStringBindable[String]].unbind("message", message)))))
    }
  
  }


}