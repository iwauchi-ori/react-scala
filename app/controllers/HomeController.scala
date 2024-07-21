package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.http._
import org.apache.pekko.util._
import java.util._


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index(p:Option[Int]) = Action {
    val arr:scala.collection.immutable.List[scala.collection.immutable.List[String]] = scala.collection.immutable.List(
      scala.collection.immutable.List("taro", "taro@yamada","999"),
      scala.collection.immutable.List("hanako", "hanako@yamada","998"),
      scala.collection.immutable.List("jiro", "jiro@yamada","997"),
    )
    Ok(views.html.index("これはコントローラーで使用したメッセージ。", arr, scala.collection.immutable.List("Name","Mail","Tel")))
  }
}
