class Rational(val numerator: Int, val denominator: Int)
val half = Rational(1, 2)
half.denominator
half.numerator

class Rational(val numerator: Int, val denominator: Int) {
  override fun toString(): String = "${numerator}/${denominator}"
}
