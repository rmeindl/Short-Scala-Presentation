def describe(x: Any) = x match {
  case 5 => "five"
  case true => "truth"
  case "hello" => "hi!"
  case Nil => "the empty list"
  case _ : Number => "a number"
  case _ => "something else"
}

println(describe(5))
println(describe(1 == 1))
println(describe(Nil))
println(describe(42))
println(describe(List[Integer](4, 42)))
