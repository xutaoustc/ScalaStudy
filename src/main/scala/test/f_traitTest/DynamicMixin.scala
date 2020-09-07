package test.f_traitTest

object DynamicMixin {
  def main(args:Array[String]):Unit={
    // 降低耦合性
    val orableDB = new OrableDB with Operate
    orableDB.insert()
  }
}

trait Operate{
  def insert():Unit={
    println("insert")
  }
}

class OrableDB{}