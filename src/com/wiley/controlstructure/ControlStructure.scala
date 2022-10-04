package com.wiley.controlstructure

object ControlStructure extends  App {
var score:Int=88
  if(score>=0 && score<50){
    println("fail")
  }else if(score >=50 && score<60){
    println("D grade")
  }else if(score>=60 && score<70){
    println("C grade")
  }else if(score>=70 && score<80){
    println("b grade ")
  }else{
    println("A grade")
  }
}
