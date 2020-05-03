package test.matchCase

object ArrayMatch {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,1)

    val result =
    arr match{
      case Array(0)=> "0"
      case Array(x)=> "值为" + x
      case Array(x,y)=> x + "=" + y
      case Array(0,_*)=>"0开头"
      case _ => "什么都不是"
    }

    println(result)
  }
}
