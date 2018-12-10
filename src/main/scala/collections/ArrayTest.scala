package collections

import scala.collection.mutable.ArrayBuffer

object ArrayTest extends App {
  val array1=Array(1,2,3)
  println(array1)

  val fruits=Array("Apple","Banana","Orange")
  println(fruits)

  val x=Array(1,2.0,33D,400L)
  println(x)
  x(0)=10
  println(x(0))

  //Creating an Array whose size can change (ArrayBuffer)
  var nameList=ArrayBuffer[String]()
  nameList +="Ben"
  nameList +="Jerry"
  nameList +="Dale"
  println(nameList)
}
