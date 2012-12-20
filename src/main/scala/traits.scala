import java.util

trait IgnoreCaseSet extends util.Set[String] {
  abstract override def add(e: String): Boolean = {
    println(s"Add '${e}'")
    super.add(e)
  }

  abstract override def remove(e: Object) = {
    println(s"Remove '${e}'")
    super.remove(e)
  }
}

val set = new util.HashSet[String] with IgnoreCaseSet

println(set.isInstanceOf[IgnoreCaseSet])
println(set.isInstanceOf[util.Set[String]])

set.add("hi there")

set.remove("hi there")
