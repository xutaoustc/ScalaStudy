package test.a_basic

import scala.util.control.Breaks._

object BreakTest {
  def main(args:Array[String]):Unit={
//控制抽象，在定义方法时去掉()，在调用时就可以省去()=>。 例如： op: => Unit
//    在Scala中，我们可以将一系列语句归组成不带参数也没有返回值的函数。举例来说，如下函数在线程中执行某段代码：
//    def runInThread(block:() => Unit){
//      new Thread{
//        override def run(){
//          block()
//        }
//      }.start()
//    }
//    当你调用该函数时，需要写一段不美观的()=>
//    runInThread{() => println("Hi");println("world")}
//    要想省略()=>,可以使用换名调用表示法，在参数声明和调用该函数参数的地方省略()=>
//    调用就可以这样：
//    runInThread{println("Hi");println("world")}

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
