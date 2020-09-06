package test.d_packageVisible.p2

class Rabbit {
  // 不仅private生效，packageVisible中的其他类也可以使用，相当于扩大了访问范围，子包也可以访问
  private[d_packageVisible] var name:String = _
}
