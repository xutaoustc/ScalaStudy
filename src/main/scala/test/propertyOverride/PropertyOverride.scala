package test.propertyOverride

object PropertyOverride {
  def main(args:Array[String]):Unit={
    val a:A = new B
    val b:B = new B

    // 和java中的行为完全不一样
    // 本质是方法的复写
    println(a.name)
    println(b.name)
  }
}

class A{
  val name = "a"
}

class B extends A{
  override val name: String = "b"
}
