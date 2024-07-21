package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.http._
import play.api.data._
import play.api.data.Forms._
import org.apache.pekko.util._

@Singleton
class HomeController @Inject()(cc: MessagesControllerComponents)
     extends MessagesAbstractController(cc) {
  import MyForm._

  def index() = Action {implicit request =>
    Ok(views.html.index(
      "これはコントローラーで用意したメッセージ。",
      myform
      ))
  }

  def form() = Action { implicit request =>
    val form = myform.bindFromRequest
    val data = form.get
    Ok(views.html.index(
        "name: " + data.name + ", pass: " + data.pass +
          ", radio:" + data.radio,
        form
    ))
  }
}
