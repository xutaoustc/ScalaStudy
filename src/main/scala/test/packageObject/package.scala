package test


// 包中不能包含函数或变量的定义。把工具函数或常量加入到包而不是某个Util对象，这是更加合理的做法，包对象的出现正式为了解决这个局限
// 在背后，被编译成test.packageObject.package这个类
package object packageObject {
  val defaultName = "xu"
  def sayHello(word:String):Unit={
    println(word)
  }
}
