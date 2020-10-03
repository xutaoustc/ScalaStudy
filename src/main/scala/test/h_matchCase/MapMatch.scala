package test.h_matchCase

import scala.collection.mutable

object MapMatch{
  def main(args: Array[String]): Unit = {
    val jobMap = new mutable.HashMap[Long, String]
    jobMap.put( 1,"a" )
    jobMap.put( 2,"b" )

    // 注意此处没有match，match之前是用在被匹配的变量之前的。这里省略了变量和match
    // 算是和exception匹配一样，是一种比较另类的模式匹配
    jobMap.foreach{
      case (k,v)=>println(k + " " + v)
    }
  }
}
