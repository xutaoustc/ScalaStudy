package test.i_function

object CurryFunction {
  def main(args: Array[String]): Unit = {
    // 一般方式实现乘法
    def mulNormal(x:Int, y:Int)={x * y}
    // 闭包方式实现乘法
    def mulClosure(x:Int)= (y:Int)=>x*y


    // 接受多个参数的函数都可以转化成接受单个参数的函数
    // 柯里函数的本质是返回高阶函数
    def mulCurry(x:Int)(y:Int)= x * y
  }
}
