package collections

object TestImmutableList extends App {
  val originalList=List(5,1,4,3,2)
  println(originalList)

  val newList=originalList.filter(_ >= 2)
  println(newList)

  val a=List(1,2,3)
  val b=List(4,5,6)
  val c= a ++ b
  println(c)

  val d= a ::: b
  println(d)

  val e= List.concat(a,b,c)
  println(e)
}
