package test.h_matchCase

object ListMatch {
  def main(args: Array[String]): Unit = {
    val list = List(0,2,3)

    val result =
      list match{
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0....."
        case _ => "something else"
      }

    println(result)
  }
}
