
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object form_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user_form: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<form id="user_form" class="form-horizontal" name="user" method="post" action="/create">
    <div class='form-group"""),_display_(/*4.28*/(if(user_form.error("name")) {" has-error"})),format.raw/*4.72*/("""'>
        <div class="col-xs-6 col-md-4">
            <label for="name">Name:</label>
        </div>
        <div class="col-xs-6 col-md-4">
            <input id="name" class="form-control" name="name" type="text">
            """),_display_(/*10.14*/if(user_form.error("name"))/*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
            """),format.raw/*11.13*/("""<span id="helpBlockName" class="help-block">
                """),_display_(/*12.18*/for(error <- user_form.error("name")) yield /*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
                    """),_display_(/*13.22*/error/*13.27*/.message),format.raw/*13.35*/("""<br/>
                """)))}),format.raw/*14.18*/("""</span>
            """)))}),format.raw/*15.14*/("""
        """),format.raw/*16.9*/("""</div>
    </div>
    <div class='form-group"""),_display_(/*18.28*/(if(user_form.error("email")) {" has-error"})),format.raw/*18.73*/("""'>
        <div class="col-xs-6 col-md-4">
            <label for="email">Email:</label>
        </div>
        <div class="col-xs-6 col-md-4">
            <input id="email" class="form-control" name="email" type="email">
            """),_display_(/*24.14*/if(user_form.error("email"))/*24.42*/ {_display_(Seq[Any](format.raw/*24.44*/("""
            """),format.raw/*25.13*/("""<span id="helpBlockEmail" class="help-block">
                """),_display_(/*26.18*/for(error <- user_form.error("email")) yield /*26.56*/ {_display_(Seq[Any](format.raw/*26.58*/("""
                    """),_display_(/*27.22*/error/*27.27*/.message),format.raw/*27.35*/("""<br/>
                """)))}),format.raw/*28.18*/("""
            """),format.raw/*29.13*/("""</span>
            """)))}),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""</div>
    </div>
    <div class="form-group">
        <div class="col-xs-6 col-md-4">
            <button id="button" class="btn btn-default">Add User</button>
        </div>
    </div>
</form>
"""))
      }
    }
  }

  def render(user_form:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(user_form)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (user_form) => apply(user_form)

  def ref: this.type = this

}


}

/**/
object form extends form_Scope0.form
              /*
                  -- GENERATED --
                  DATE: Tue Sep 08 21:32:39 BST 2015
                  SOURCE: /Users/andyatkinson/orange-bus-form/app/views/form.scala.html
                  HASH: 06d8dbd6fca94f04db042e7c58116c85659fe408
                  MATRIX: 529->1|647->24|675->26|817->142|881->186|1138->416|1174->443|1214->445|1255->458|1344->520|1397->557|1437->559|1486->581|1500->586|1529->594|1583->617|1635->638|1671->647|1743->692|1809->737|2071->972|2108->1000|2148->1002|2189->1015|2279->1078|2333->1116|2373->1118|2422->1140|2436->1145|2465->1153|2519->1176|2560->1189|2612->1210|2648->1219
                  LINES: 20->1|25->1|27->3|28->4|28->4|34->10|34->10|34->10|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|39->15|40->16|42->18|42->18|48->24|48->24|48->24|49->25|50->26|50->26|50->26|51->27|51->27|51->27|52->28|53->29|54->30|55->31
                  -- GENERATED --
              */
          