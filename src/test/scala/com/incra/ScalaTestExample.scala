package com.incra

import com.incra.models.{Circle, Point}

import org.scalatest._

/**
 * Created by jeff on 7/15/15.
 */
class ScalaTestExample extends FlatSpec with Matchers {

  "A Point" should "be creatable" in new TestScope {

    point.x shouldBe 5.0
    point.y shouldBe 7.0
  }

  it should "be comparable" in {
    val point1 = Point(8.0, 17.0)
    val point2 = Point(8.0, 17.0)

    point1 shouldBe point2
  }

  "A Circle" should "be creatable" in new TestScope {

    circle.center.x shouldBe 5.0
    circle.center.y shouldBe 7.0
  }

  trait TestScope {
    val point = new Point(5.0, 7.0)
    val circle = Circle(Point(5.0, 7.0), 1.0)
  }
}
