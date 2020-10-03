package test.h_matchCase

object TypeMatch {
  def main(args: Array[String]): Unit = {
    val a = 8
    val obj = if(a==1) 1
    else if(a==2) "2"
    else if(a==3) BigInt(3)
    else if(a==4) Map("aa"->1)
    else if(a==5) Map(1->"aa")
    else if(a==6) Array(1,2,3)
    else if(a==7) Array("aa",1)
    else if(a==8) Array("a")

    val result = obj match{
      case a:Int=> a
      case b:Map[String,Int]=> "对象是一个String-Int的Map"
      case c:Map[Int,String]=> "对象是一个Int-String的Map"
      case d:Array[String] => "对象是一个字符数组"
      case e:Array[Int] => "对象是一个Int数组"
      case f:BigInt => Int.MaxValue
      case _ => "什么也不是"
    }

    println(result)
  }
}
