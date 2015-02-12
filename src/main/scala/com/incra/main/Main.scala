package com.incra.main

import com.incra.models._

/**
 * Created by jeff on 2/12/15.
 */

object Main {

  def main(args: Array[String]) {
    println("welcome to SC26")

    val p00 = new Point()

    val p20 = new Point(2.0)

    val p20b = new Point(2.0)

    val p02 = new Point(y = 2.0)

    println(p00 == p20)

    println(p20 == p20b)

    val circle00 = new Circle(Point(0.0, 0.0), 6.0)
    val circle01 = new Circle(Point(0.0, 1.0), 8.0)

    def f(str: String) { println(s"ShapeDrawing: $str")}

    circle00.draw(str => println(s"ShapeDrawing: $str"))
    circle01.draw(f)
  }
}
