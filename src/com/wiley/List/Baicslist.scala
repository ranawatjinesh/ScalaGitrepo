package com.wiley.List

object Baicslist extends  App {
var listOfNumbers = List(1,2,3,4,5,6,7,8,9)
  Baicslist.listOfNumbers.foreach{
    println
  }
  listOfNumbers.foreach(print)
  println
  listOfNumbers.foreach((eler:Int)=>print(eler+" "))

}
