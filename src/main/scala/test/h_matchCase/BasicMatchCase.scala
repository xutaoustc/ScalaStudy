package test.h_matchCase

object BasicMatchCase {
  def main(args: Array[String]): Unit = {
    operate()
  }


  def operate():Unit={
    val oper = '*'
    val n1 = 20
    val n2 = 10
    var res = 0

    // 不需要写break
    // 如果所有都没有匹配上，又没有写_分支，会抛出异常
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      // 范围匹配， 如果case后有条件守卫，如果使用变量则可以接收，如果使用_那么这时的_不是表示默认匹配，而是表示忽略传入的值
      case v if v=='/' || v == '*' => println("not supported")
      case _ => println("error")
    }

    println("res=" + res)
  }
}
