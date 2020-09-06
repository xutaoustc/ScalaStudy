package test.d_packageVisible

import test.d_packageVisible.p2.Rabbit

object TestPackageVisible {
  val rabbit = new Rabbit
  rabbit.name
}
