package com.wiley.controlstructure

object TernaryOperators {
 def main(args:Array[String]): Unit ={
   val result=check(-10)
   println(result)
 }
  def check(a:Int)= if(a>=0) 1 else -1
}
