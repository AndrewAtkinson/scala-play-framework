
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcome page")/*1.22*/{_display_(Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*3.1*/("""Please Choose the an option from the menu.

""")))}),format.raw/*5.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Sep 05 14:46:44 BST 2015
                  SOURCE: /Users/andyatkinson/orange-bus-form/app/views/index.scala.html
                  HASH: 8e78e80913aa6fcea3d7694376ecde06d5da89c6
                  MATRIX: 609->1|637->21|675->22|703->24|777->69
                  LINES: 25->1|25->1|25->1|27->3|29->5
                  -- GENERATED --
              */
          