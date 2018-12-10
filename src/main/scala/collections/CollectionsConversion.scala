package collections
import collection.JavaConverters._
import collection.mutable._
object CollectionsConversion extends App {
  val jul: java.util.List[Int] = ArrayBuffer(1, 2, 3).asJava
  println(jul)

  val buf: Seq[Int] = jul.asScala
  println(buf)

  val m: java.util.Map[String, Int] = HashMap("abc" -> 1, "hello" -> 2).asJava
  println(m)

  /*Java does not distinguish between mutable and immutable collections
    in their type, a conversion from, say, scala.immutable.List will yield
    a java.util.List, where all mutation operations throw an “UnsupportedOperationException”.
    Here’s an example
   */
  val javaList = List(1, 2, 3).asJava
  javaList.add(7)

}
