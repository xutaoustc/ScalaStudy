package test.matchCase

object TypeMatch {
  def main(args: Array[String]): Unit = {
    try{
      val a = 1 / 0
    }catch{
      case ex:ArithmeticException => println("算术异常")
      case ex:Exception => println("其他异常")
    }
  }
}
