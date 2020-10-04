package test.i_function

object ClosureTest {
  def main(args: Array[String]): Unit = {
    // 闭包就是一个函数和与其相关的引用环境组合的一个整体
    // 其实在很多语言里面，闭包返回的就是一个对象，函数是方法，其引用的环境就是它的属性
    // 使用传统的方法也可以轻松实现类似功能，但是传统方法每次都要传递相应值，闭包的好处在于，可以保留上次引用的值，传入一次可反复使用
    def minusxy(x:Int)={
      (y:Int)=>x-y
    }

    val fun = minusxy(20)
    println(fun(2))
  }
}
