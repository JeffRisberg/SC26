package com.incra

import com.incra.models.{Circle, Point}
import org.specs2.specification.Scope
import org.specs2.mutable.Specification

/**
 * Created by jeff on 7/15/15.
 */
class Specs2Example extends Specification {
  "A Point" should {

    "be creatable" in new TestScope {

      point.x mustEqual 5.0
      point.y mustEqual 7.0
    }

    "be comparable" in new TestScope {
      val point1 = Point(8.0, 17.0)
      val point2 = Point(8.0, 17.0)

      point1 mustEqual point2
    }
  }

  "A Circle" should {

    "be creatable" in new TestScope {

      circle.center.x mustEqual 5.0
      circle.center.y mustEqual 7.0
    }
  }

  trait TestScope extends Scope {
    val point = new Point(5.0, 7.0)
    val circle = Circle(Point(5.0, 7.0), 1.0)
  }
}
