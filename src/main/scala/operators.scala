class Fraction(var numerator: Int, var denominator: Int) {

  def *(fraction2: Fraction) = {
    new Fraction(numerator * fraction2.numerator, denominator * fraction2.denominator)
  }

  override def toString = numerator + "/" + denominator
}

val fract1 = new Fraction(3, 4)
val fract2 = new Fraction(2, 4)
val result = fract1 * fract2

println(result)