package test.packageObject.sub

object Main {
  def main(args:Array[String]):Unit={
    // 在其他地方需要使用完整限定名
    test.packageObject.sayHello(test.packageObject.defaultName)
    // 子包中无法直接使用
    //sayHello(defaultName)

  }
}
