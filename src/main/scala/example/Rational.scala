package example
class Rational(x:Int,y :Int){
  require(y!=0,"denominator must be nonzero!")

  private def gcd(n1:Int,n2:Int):Int = if(n2==0) n1 else gcd(n2,n1%n2)
  private val g=gcd(x,y)
  val numerator=x/g
  val denominator=y/g
  //This method add rational number
  def add(that:Rational)={
    new Rational(this.numerator*that.denominator+that.numerator*this.denominator,
      this.denominator*that.denominator)
  }

  //This method returns negative of rational number
  def neg:Rational =new Rational(-this.numerator,this.denominator)

  //This method subtract rational number from given rational
  def sub(that:Rational)=add(that.neg)

  def less(that:Rational): Boolean = this.numerator*that.denominator<that.numerator*this.denominator

  override def toString = this.numerator+"/"+this.denominator

  override def hashCode(): Int = super.hashCode()

  override def equals(obj: Any): Boolean = super.equals(obj)
}
