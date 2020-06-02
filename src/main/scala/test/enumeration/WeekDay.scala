package test.enumeration

object WeekDay extends Enumeration {
  type WeekDay = Value//这里仅仅是为了将Enumration.Value的类型暴露出来给外界使用而已
  val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value//在这里定义具体的枚举实例
}
