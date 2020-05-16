package test.implicitConversion

object ImplicitValueTest {
  def main(args:Array[String]):Unit={
    // 隐式值也叫隐式变量，将某个形参标记成implicit，所以编译器会在方法省略隐式参数的情况下去搜索作用域内的隐式值作为缺省参数
    // 隐式值可以作用于多个函数，给多个函数提供默认值

    // 隐式参数也是一个必须要传入值的参数，只是如果它有隐式值的时候，可以注入，如果没有隐式值那么必须还要指定参数传入

    // 1. 在程序中同时有隐式值，默认值，传值时，编译器的优先级为传值>隐式值>默认值
    // 2. 隐式值匹配时，不能有二义性
    // 3. 如果三个(隐式值，默认值，传值)都匹配不到，则会报错

    implicit val i = 10

    fun
    fun(11)

//    fun1
  }

  def fun(implicit i:Int):Unit={
    println(i)
  }


  def fun1(implicit i:String):Unit={
    println(i)
  }
}
