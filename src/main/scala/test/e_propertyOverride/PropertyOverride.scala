package test.e_propertyOverride

object PropertyOverride {
  def main(args:Array[String]):Unit={
    val a:A = new B
    val b:B = new B

    // 和java中的行为完全不一样
    // 本质是get方法的覆盖
    println(a.name)
    println(b.name)
  }
}

class A{
  val name = "a"
}

class B extends A{
  // def只能重写另外一个def
  // val只能重写另一个val属性，或者重写不带参数的def
  // var只能重写另一个抽象的var属性
  override val name: String = "b"
}
