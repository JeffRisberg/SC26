package com.incra

import com.incra.models.Point
import org.specs2.specification.Scope
import org.specs2.mutable.Specification

/**
 * Created by jeff on 7/17/15.
 */
class TestSpec extends Specification {
  "A Point" should {
    "be creatable" in new TestScope {
      val point = Point(5.0, 7.0)

      point.x mustEqual 5.0
      point.y mustEqual 7.0
    }
  }

  trait TestScope extends Scope {

  }
}
