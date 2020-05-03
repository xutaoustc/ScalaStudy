package test.traitTest

object DynamicMixin {
  def main(args:Array[String]):Unit={
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