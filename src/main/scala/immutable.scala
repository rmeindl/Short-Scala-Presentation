import collection.immutable.BitSet

val weekend = List("Saturday", "Sunday")
val days =  "Monday" :: "Tuesday" :: "Wednesday" :: "Thursday" :: "Friday" :: weekend

days match {
  case firstDay :: _ =>
    println("The first day of the week is: " + firstDay)
  case Nil =>
    println("There don't seem to be any week days.")
}

val bits = BitSet(1, 2, 3)

println(bits.map(x => x * 2))

def count(list: Iterable[Any]): Int = list.foldLeft(0)((sum, _) => sum + 1)

println(count(bits))