package test.function

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
