package collections

import scala.collection.mutable.ListBuffer

object TestMutableList extends App {

  var fruits = new ListBuffer[String]()

  //Add one element at a time to the ListBuffer
  fruits +="Apple"
  fruits +="Banana"
  fruits +="Orange"
  println(fruits)

  //add multiple elements
  fruits +=("Strawberry","Kiwi","Pineapple")
  println(fruits)

  //remove one elements
  fruits -="Apple"
  println(fruits)

  //remove multiple elements
  fruits -=("Banana","Orange")
  println(fruits)

  //remove multiple elements specified by another sequence
  fruits --=Seq("Kiwi","Pineapple")
  println(fruits)
  //convert the ListBuffer to a List when you need to
  val fruitsList=fruits.toList
  println(fruitsList)

}
