package test.function

// 在Scala里，我们可以使用case语句来创建一个匿名函数（函数字面量）
// List(1,2,3) map {case i:Int=>i+1},  这很有趣，case i:Int=>i+1构建的匿名函数等同于(i:Int)=>i+1
// case语句“额外”的好处：case语句（组合）除了可以被编译为匿名函数（类型是FunctionX，在Scala里，所有的函数字面量都是一个对象，
// 这个对象的类型是FunctionX），还可以非常方便的编译为一个偏函数PartialFunction！（注意：PartialFunction同时是Function1的子类）
// 编译器会根据调用处的函数类型声明自动帮我们判定如何编译这个case语句

// 从collect这个示例的效果上去理解偏函数：它只对会作用于指定类型的参数或指定范围值的参数实施计算，超出它的界定范围之外的参数类型和值它会忽略

object PartialFunctionTest {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,"ha")

    // 对符合某个条件，而不是所有情况执行逻辑操作时
    val partialFun = new PartialFunction[Any,Int] {
      override def isDefinedAt(x: Any): Boolean = {
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }

    // map不支持偏函数，因为map底层是要处理所有元素
    val list2 = list.collect(partialFun)
    println(list2)

    // 偏函数的简单写法
    val list3 = list.collect{
      case i:Int=>i+1
    }
  }
}
