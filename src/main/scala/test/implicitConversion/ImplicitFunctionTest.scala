package test.implicitConversion

object ImplicitFunctionTest {
  def main(args:Array[String]):Unit={
    // 隐式转换函数是以implicit关键字申明的带有单个参数的函数。这种函数会自动应用,将值从一种类型转为另一种类型
    // 隐式转换函数通常在源类型或目标类型的伴生对象中，或者在当前程序作用域中，否则则需要通过import手动引入隐式转换函数
    // 当方法中的参数类型和目标类型不一致时；赋值时；当对象调用所在类中不存在的方法或成员时，编译器会自动将对象进行隐式转换
    implicit def double2Int(d:Double):Int=d.toInt

    val i:Int = 2.5
  }
}
