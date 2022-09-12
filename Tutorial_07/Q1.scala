object Q1 extends App{
  val r = new RationalNumber(3,5)
  println(r.neg)
}

class RationalNumber(n:Int, d:Int) {
  require(denominator > 0, "Denominator must be greater than 0")
  def numerator = n
  def denominator = d

  def neg = new RationalNumber(-this.numerator, this.denominator)
  override def toString(): String = numerator + "/" + denominator
}