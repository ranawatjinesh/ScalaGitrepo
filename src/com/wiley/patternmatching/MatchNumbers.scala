package com.wiley.patternmatching

object MatchNumbers extends  App{
 var a=1
   a match {
     case 1 => println("One")
     case 2 => println("two")
     case _ => println("No")
   }
}
