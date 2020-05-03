package test.packageVisible.p1

import test.packageVisible.p2.Rabbit

class AccessRabbit {
  def fun():Unit={
    val rabbit = new Rabbit()
    // we can access name !!!
    rabbit.name
  }
}
