object alpha {
  System.out.println("hello")
  println("beta")
  val a = List(1.2, 6.6, 7.7, 8.8)
  a.map { x => 2 * x}
  val b = Array(4, 5, 6, 7)

  for (c <- b) {
    if (c % 2 == 0) println("even") else println("odd")
  }
}