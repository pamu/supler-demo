package forms

import org.supler.Supler._
//import org.supler.field.ActionResult

/**
  * Created by pnagarjuna on 04/11/15.
  */
case class Person(name: String)

object Forms {
  val personForm = form[Person] { f =>
    List(
      f.field(_.name).label("Name")
    )
  }
}