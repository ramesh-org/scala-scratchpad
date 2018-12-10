package collections

object ListsTest extends App{
  println("Start Lists Test!")
  val list=new Cons(1,new Cons(2,new Cons(3,new Cons(10,new Nil))))
  println("Max:"+Lists.max(list))
  println("Sum:"+Lists.sum(list))
  println("nth ="+Lists.nth(0,list))
  //println("nth ="+Lists.nth(-1,list))
  println("nth ="+Lists.nth(4,list))
}
