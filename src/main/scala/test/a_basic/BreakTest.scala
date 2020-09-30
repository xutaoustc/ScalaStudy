package test.a_basic

import scala.util.control.Breaks._

object BreakTest {
  def main(args:Array[String]):Unit={
    var n = 1

    breakable{
      while(n < 20){
        n += 1
        println(n)

        if(n == 18){
          break()   // 抛出异常
        }
      }
    }

    println("result")
  }
}
