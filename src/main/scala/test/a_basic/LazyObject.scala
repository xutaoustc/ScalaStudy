package test.a_basic

object LazyObject {
  def main(args: Array[String]): Unit = {
    // 也可以是局部变量
    lazy val v = getValueFunction
    println("-----")
  }

  def getValueFunction={
    "hello"
  }
}
