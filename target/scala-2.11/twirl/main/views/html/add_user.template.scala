
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object add_user_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class add_user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[User],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user_form: Form[User],message_type: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),_display_(/*3.2*/main("Add User")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

"""),_display_(/*5.2*/if(message_type == "success")/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
"""),format.raw/*6.1*/("""<div class="alert alert-success" role="alert">The user was successfully added!</div>
""")))}),format.raw/*7.2*/("""
"""),_display_(/*8.2*/if(message_type == "failed")/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
"""),format.raw/*9.1*/("""<div class="alert alert-danger" role="alert">There was a problem and the user was not added.</div>
""")))}),format.raw/*10.2*/("""

"""),_display_(/*12.2*/views/*12.7*/.html.form.render(user_form)),format.raw/*12.35*/("""

""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(user_form:Form[User],message_type:String): play.twirl.api.HtmlFormat.Appendable = apply(user_form,message_type)

  def f:((Form[User],String) => play.twirl.api.HtmlFormat.Appendable) = (user_form,message_type) => apply(user_form,message_type)

  def ref: this.type = this

}


}

/**/
object add_user extends add_user_Scope0.add_user
              /*
                  -- GENERATED --
                  DATE: Mon Sep 07 21:07:08 BST 2015
                  SOURCE: /Users/andyatkinson/orange-bus-form/app/views/add_user.scala.html
                  HASH: eda3ad8de804c0769afc0b52a3a00b1ba74306b4
                  MATRIX: 544->1|688->50|716->53|740->69|779->71|807->74|844->103|883->105|910->106|1025->192|1052->194|1088->222|1127->224|1154->225|1284->325|1313->328|1326->333|1375->361|1408->364
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5|29->5|30->6|31->7|32->8|32->8|32->8|33->9|34->10|36->12|36->12|36->12|38->14
                  -- GENERATED --
              */
          