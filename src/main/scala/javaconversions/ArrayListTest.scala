package javaconversions

import java.util

import examples.JavaList

import scala.collection.JavaConversions._

object ArrayListTest extends App {
  def nums={
    val list=new util.ArrayList[Int]()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list
  }

  println(nums)

  val list=nums

  list.foreach(println)

  val javaList=JavaList.getNumbers
  println(javaList)

  val numbers = asScalaBuffer(JavaList.getNumbers)
  numbers.foreach(println)
  println(numbers.getClass)

  val map=JavaList.getPeeps
  map.foreach(println)

  // explicit call
  val peeps1 = mapAsScalaMap(JavaList.getPeeps)
  println(peeps1)

}
