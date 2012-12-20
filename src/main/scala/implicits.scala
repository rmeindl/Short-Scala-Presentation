import reflect.ClassTag

val arr = List(1, 2, 3, 4, 5)

def evenElements[T](xs: Seq[T])(implicit m: ClassTag[T]): Array[T] = {
  val arr = new Array[T]((xs.length + 1) / 2)
  for (i <- 0 until xs.length by 2)
    arr(i / 2) = xs(i)
  arr
}

def prettyPrint(arr: Array[Int]) = arr.mkString(", ")

val evenArr = evenElements(arr)
println(prettyPrint(evenArr))

