package test.a_basic

object Apply {
  def main(args: Array[String]): Unit = {
    val a = new A()

    // 对象也能使用apply方法
    println(a(1))
  }
}


class A{
  val arr = Array(1,2,3)
  def apply(i:Int)={
    arr(i)
  }
}
