package test.multiThread

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object FutureTest {
  def main(args: Array[String]): Unit = {
    val future = Future {
      for(i<-1 to 100000)
        println("sss" + i)
    }

    future onComplete  {
      case Success(_) =>
        println("complete")
    }


    for(i<-1 to 100000)
      println("main" + i)
  }
}
