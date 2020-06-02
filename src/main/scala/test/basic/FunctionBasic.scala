package test.basic

import scala.collection.mutable

object FunctionBasic {
  def main(args:Array[String]):Unit={
    val f1 = new Dog().wow _
    f1()

    val f2 = (a1:Int)=>{println(a1)}
    f2(1)

    val functionMap = new mutable.HashMap[String,(String)=>Unit]()
    functionMap("sayHello") = sayHello
  }

  def sayHello(word:String):Unit={

  }
}


class Dog{
  def wow():Unit={
    println("wow")
  }
}