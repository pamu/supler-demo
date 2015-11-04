package controllers

import play.api.mvc.{Action, Controller}

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Hello Play Framework"))
  }

  def form = Action { request =>
    import forms._
    import org.json4s.native.JsonMethods
    val formJson = Forms.personForm(Person(name = "pamu")).generateJSON
    Ok(JsonMethods.compact(JsonMethods.render(formJson))).as("application/json")
  }
}