package be.objectify.deadbolt.scala.test.controllers.composed

import be.objectify.deadbolt.scala.DeadboltActions
import play.api.mvc.Controller

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
 * @author Steve Chaloner (steve@objectify.be)
 */
class Dynamic(deadbolt: DeadboltActions) extends Controller {

  def index =
    deadbolt.Dynamic(name = "niceName")() { authRequest =>
      Future {
        Ok("Content accessible")
      }
    }
}
