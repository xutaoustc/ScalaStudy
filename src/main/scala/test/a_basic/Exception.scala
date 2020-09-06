package test.a_basic

import java.io.IOException

object Exception {
  def main(args: Array[String]): Unit = {
    try {
//      throwsException()
    } catch {
      case e: IllegalArgumentException => println("illegal arg. exception");
      case e: IllegalStateException    => println("illegal state exception");
      case e: IOException              => println("IO exception");
    } finally {
      println("this code is always executed");
    }
  }
}
