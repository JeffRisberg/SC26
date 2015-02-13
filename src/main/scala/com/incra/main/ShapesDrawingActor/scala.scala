package com.incra.main.ShapesDrawingActor

/**
 * Created by jeff on 2/11/15.
 */
object Messages {
  object Exit
  object Finished
  case class Response(message: String)
}

import akka.actor.Actor
import com.incra.models.Shape

class ShapesDrawingActor extends Actor {
  import Messages._

  def receive = {
    case s: Shape =>
      s.draw(str => println(s"ShapesDrawingActor: $str"))
      sender ! Response(s"ShapesDrawingActor: $s drawn")
    case Exit =>
      println(s"ShapesDrawingActor: exiting")
      sender ! Finished
    case unexpected =>
      val response = Response(s"Error Unknown message $unexpected")
      println(s"ShapesDrawingActor: $response")
      sender ! response
  }
}