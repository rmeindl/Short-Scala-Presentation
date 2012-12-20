class Currency private(var value: BigDecimal = 0, val symbol: String = "EUR") {
  override def toString = s"Currency($symbol $value)"
}

object Currency {
  def apply(v: BigDecimal): Currency = new Currency(v)

  def unapply(currency: Currency) = {
    Some(currency.value, currency.symbol)
  }
}

object CurrencyImplicits {
  implicit def bigDecimalToCurrency(value: BigDecimal) = Currency(value)
}

import CurrencyImplicits._

val myCurrency: Currency = BigDecimal(42)

println(myCurrency toString)

val Currency(_, symbol) = myCurrency

println(symbol)