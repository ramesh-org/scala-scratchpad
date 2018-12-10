package example

import java.text.DateFormat
import java.util.{Date, Locale}

object FrenchDate {
  def main(args:Array[String]): Unit ={
    val now=new Date()
    val df=DateFormat.getDateInstance(DateFormat.LONG,Locale.FRANCE)
    println(df format now)
  }
}
