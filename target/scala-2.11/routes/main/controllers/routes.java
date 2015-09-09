
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/andyatkinson/orange-bus-form/conf/routes
// @DATE:Mon Sep 07 21:14:49 BST 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUser_Controller User_Controller = new controllers.ReverseUser_Controller(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUser_Controller User_Controller = new controllers.javascript.ReverseUser_Controller(RoutesPrefix.byNamePrefix());
  }

}
