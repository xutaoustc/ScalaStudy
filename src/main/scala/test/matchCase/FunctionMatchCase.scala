package test.matchCase

import scala.collection.mutable

object FunctionMatchCase {
  def main(args:Array[String]):Unit={

    val jobMap           = new mutable.HashMap[Long, mutable.HashMap[Long, Long]]
    jobMap.put( 1,new mutable.HashMap[Long, Long]() )


    jobMap.foreach {
      case (_, value) => {
        value.put(1,1)
      }
    }

    println("ss")
  }
}
