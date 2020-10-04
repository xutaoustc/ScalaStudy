package test.i_function

object PartialFunctionTest {
  def main(args: Array[String]): Unit = {
    // 如果我们想对一个List里面所有的数字+1，但是要过滤掉字符串，我们可以使用：
    //    1. filter+map的方式， 但是稍显麻烦
    //    2. 也可以使用map+模式匹配，但是又要对字符串模式匹配时返回的空值做过滤
    // 在对符合某个条件，而不是所有情况执行逻辑操作时，使用偏函数是一个不错的选择
    // 将包在大括号内的一组case语句封装为函数，我们称之为偏函数
    val list = List(1,2,3,4,"ha")

    val partialFun = new PartialFunction[Any,Int] {
      // 如果返回true, 会调用apply；如果是false，则会被过滤
      override def isDefinedAt(x: Any): Boolean = {
        x.isInstanceOf[Int]
      }
      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }

    // 使用偏函数
    // 说明：如果使用偏函数，则不能使用map，应该使用collect。map不支持偏函数，因为map底层是要处理所有元素
    val list2 = list.collect(partialFun)
    println(list2)

    // 偏函数的简单写法
    val list3 = list.collect{
      case i:Int=>i+1
    }
  }
}
