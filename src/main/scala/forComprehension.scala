def foo(n: Int, v: Int) =
  for (i <- 0 until n; j <- i + 1 until n; if i + j == v) yield (i, j)

foo(20, 32) foreach {
  case (i, j) => println("(" + i + ", " + j + ")")
}
