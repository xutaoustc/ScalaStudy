package test.basic

object LazyObject {
  def main(args: Array[String]): Unit = {
    lazy val a = aa
    println("-----")
  }

  def aa={
    "hello"
  }
}
