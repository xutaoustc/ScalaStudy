package test.h_matchCase


object ObjectMatch {
  def main(args: Array[String]): Unit = {
    val number:Double = 36.0

    // 对象匹配：什么情况算是匹配呢？
    //  1. case对象中的unapply方法返回some集合则为匹配成功
    //  2. 返回none则为匹配失败
    number match{
      // 匹配到case Square(n)时，调用Square的unapply(z:Double)，z的值就是number。
      case Square(n)=>println(n)
      case _=> println("can not match")
    }

    val namesString = "Alice,Bob,Thomas"
    namesString match {
      case Names(first,second,third)=>{
        println(first,second,third)
      }
      case _ => println("nothing matches")
    }
  }
}

object Square{
  def apply(z:Double):Double = z * z
  def unapply(z:Double):Option[Double] = Some(math.sqrt(z))
}


object Names{
  def unapplySeq(str:String):Option[Seq[String]]={
    Some(str.split(","))
  }
}