package test.matchCase

object ListMatch {
  def main(args: Array[String]): Unit = {
    val list = List(0,2,3)

    val result =
      list match{
        case 0 :: Nil => "0"
        case x :: y :: Nil => x + " "
        case 0 :: tail1 => "0....."
        case _ => "something else"
      }

    println(result)
  }
}
