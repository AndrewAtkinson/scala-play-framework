
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/andyatkinson/orange-bus-form/conf/routes
// @DATE:Mon Sep 07 21:14:49 BST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
