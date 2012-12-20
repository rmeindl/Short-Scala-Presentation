import annotation.tailrec

val belowFirst  = (xs : List[Int]) => {
  val first = xs(0)

  val isBelow  = (y : Int) => y < first

  for(x <- xs; if(isBelow(x))) yield x
}

def printFunctionResult1(l: Any) = println(belowFirst)

printFunctionResult1()

val printBelowFirst = printFunctionResult1(_)

printBelowFirst(List(5, 1, 7, 4, 9, 11, 3))

def factorial(n : BigInt) = {

  @tailrec
  def factorial(fact : BigInt, n : BigInt) : BigInt =
    if(n == 1) fact else factorial(fact * n, n - 1)

  factorial(1, n)
}

println(factorial(10000))