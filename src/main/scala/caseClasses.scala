sealed abstract class Expression
case class Var() extends Expression
case class Const(value : Int) extends Expression
case class Add(left : Expression, right : Expression) extends Expression
case class Mult(left : Expression, right : Expression) extends Expression

def eval(expression : Expression, value : Int) : Int = expression match {
  case Var() => value
  case Const(cst) => cst
  case Add(left, right) => eval(left, value) + eval(right, value)
  case Mult(left, right) => eval(left, value) * eval(right, value)
}

val const1 = Const(1)
val const2 = const1.copy(value = const1.value + 1)

val expr = Add(const1, Mult(const2, Mult(Var(), Var())))
assert(eval(expr, 3) == 19)
println(eval(expr, 3))
