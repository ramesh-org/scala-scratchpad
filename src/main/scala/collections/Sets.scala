package collections

object Sets extends App{
  val fruit = Set("apple", "orange", "peach", "banana")
  fruit.contains("apple")
  println(fruit)

  var s=Set(1,2,3,4)
  s +=5
  println(s)

  var s2=Set(2,6)

  var s3=s++s2

  println(s3)
}
