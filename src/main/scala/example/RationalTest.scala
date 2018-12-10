package example

object RationalTest extends App {
  println("Test")
  val rational = new Rational(1,2)
  println(rational)
  val rational2=new Rational(2,5)
  println(rational2)
  println(rational2.less(rational))
  println("Sum:"+rational.add(rational2))
  println(rational2.neg)
  println(rational2.sub(rational))
  println(rational.less(rational2))


}
