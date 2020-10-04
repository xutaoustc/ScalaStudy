package test.i_function

object TailRecursive {
  def main(args:Array[String]):Unit={
    println(fact(6,1))
  }

  def fact(n:Int, r:Int):Int= {
    if (n <= 0) {
      return 1 * r;
    } else {
      // 若函数在尾位置调用自身（或是一个尾调用本身的其他函数等等），则称这种情况为尾递归
      // 函数栈的目的是啥？是保持入口环境。那么在什么情况下可以把这个入口环境给优化掉？答案不言而喻，入口环境没意义的情况下为啥要保持入口环境？尾递归，就恰好是这种情况。
      // 因为尾递归的情况下，我们保持这个函数的入口环境没意义，所以我们就可以把这个函数的调用栈给优化掉
      // 当里面这个 fact(n - 1, r * n) 返回的时候，外面的 fact(n, r) 就马上要返回了，所以保存栈是没有任何意义的，既然没意义我们毫无疑问就要优化掉。
      return fact(n - 1, n * r);
    }
  }
}
