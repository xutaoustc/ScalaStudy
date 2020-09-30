package test.a_basic

object LazyObject {
  def main(args: Array[String]): Unit = {
    lazy val v = getValueFunction
    println("-----")
  }

  def getValueFunction={
    "hello"
  }
}
