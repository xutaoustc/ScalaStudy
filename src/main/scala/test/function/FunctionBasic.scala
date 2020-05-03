package test.function

object FunctionBasic {
  def main(args:Array[String]):Unit={
    val f1 = new Dog().wow _
    f1()

    val f2 = (a1:Int)=>{println(a1)}
    f2(1)
  }
}


class Dog{
  def wow():Unit={
    println("wow")
  }
}