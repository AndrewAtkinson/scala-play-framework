
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object links_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class links extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="container-fluid">
    <ul class="nav navbar-nav">
        <li role=" presentation"><a href="/add">Add User</a></li>
        <li role="presentation"><a href="/api/list">View Users</a></li>
    </ul>
    <form class="navbar-form navbar-left" role="search" method="get" action="/search">
        <div class="form-group">
            <input name="name" type="text" class="form-control" placeholder="Search for">
        </div>
        <div class="form-group">
            <select name="field" class="form-control">
                <option value="name">Name</option>
                <option value="email">Email</option>
            </select>
        </div>
        <button type="submit" class="btn btn-default">Search</button>
    </form>
</div>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object links extends links_Scope0.links
              /*
                  -- GENERATED --
                  DATE: Mon Sep 07 21:12:05 BST 2015
                  SOURCE: /Users/andyatkinson/orange-bus-form/app/views/links.scala.html
                  HASH: cfac4bd9928122a8d05d3b451a78793c3c0c37b9
                  MATRIX: 609->0
                  LINES: 25->1
                  -- GENERATED --
              */
          