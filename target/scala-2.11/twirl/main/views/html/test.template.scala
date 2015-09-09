
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any]()
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Sun Sep 06 20:22:37 BST 2015
                  SOURCE: /Users/andyatkinson/orange-bus-form/app/views/test.scala.html
                  HASH: 3a660089e76b0b5157bf328e512c5b37b253d1eb
                  MATRIX: 
                  LINES: 
                  -- GENERATED --
              */
          