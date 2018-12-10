package collections

object StreamTest extends App {
  val stream1= 1 #:: 2 #:: 3 #:: Stream.empty
  println(stream1)

  val stream2=(1 to 100000000).toStream
  println(stream2)
  println(stream2.head)
  println(stream2.tail)
  println(stream2.take(3))
  println(stream2.filter(_ < 200))
  println(stream2.filter(_ > 200))
  println(stream2.map{_ *2})

}
