package test.a_basic

object StringPrint {
  def main(args: Array[String]): Unit = {
    printf("名字=%s\n", "tt")
    val age= 10
    println(s"年龄=$age")
    println(s"一年后，年龄=${age+1}")
  }
}
