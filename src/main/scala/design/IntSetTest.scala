package design

object IntSetTest extends App {
  val t1=new NonEmpty(3,Empty,Empty)
  val t3=new NonEmpty(10,Empty,Empty)
  println(t1 contains 4)
  val t2= t1 incl 4
  println(t2 contains 4)
  println(t2)
  println(t1 union t3)
}
