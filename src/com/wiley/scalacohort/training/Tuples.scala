package com.wiley.scalacohort.training

object Tuples extends  App{
  val tuple:(String,Int)=("Jinesh",24)
  val stillTuple= "Jinesh"-> 24
  val tuple3 :(String,Int,Boolean)=("Jinesh",34,true)
  println(stillTuple)

val name = tuple._1
  println(name)
  val age=tuple._2
  println(age)
  val (username,wifeage)=stillTuple
  println(wifeage)
  val (_,agetemp)=stillTuple
  println(agetemp)


  val data= Map("A"-> 6,
  "B"->25,
  "C"-> 40,
  "D"-> 5)
  println(data.mkString(" || "))

  case class Person(name:String , isAdult:Boolean)
  val createPerson: (String, Int) => Person  = (name,age)=> Person(name,age>18)

  val users=data.map(createPerson.tupled)

  println(users)
}
