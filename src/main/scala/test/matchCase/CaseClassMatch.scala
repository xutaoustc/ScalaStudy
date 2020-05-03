package test.matchCase

object CaseClassMatch {
  def main(args: Array[String]): Unit = {
    //    在声明样例类时，下面的过程自动发生了：
    //      构造器的每个参数都成为val，除非显式被声明为var，但是并不推荐这么做；
    //      在伴生对象中提供了apply方法，所以可以不使用new关键字就可构建对象；
    //      提供unapply方法使模式匹配可以工作；
    //      生成toString、equals、hashCode和copy方法，除非显示给出这些方法的定义。
    val dollar = Dollar(10)

    dollar match{
      case Dollar(v)=> println(v)
    }
  }

  case class Dollar(amount:Int)
}
