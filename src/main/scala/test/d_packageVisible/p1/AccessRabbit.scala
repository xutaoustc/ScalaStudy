package test.d_packageVisible.p1

import test.d_packageVisible.p2.Rabbit

class AccessRabbit {
  def fun():Unit={
    val rabbit = new Rabbit()
    // we can access name !!!
    rabbit.name
  }
}
