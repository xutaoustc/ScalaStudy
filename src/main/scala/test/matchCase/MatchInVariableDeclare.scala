package test.matchCase

object MatchInVariableDeclare {
  def main(args: Array[String]): Unit = {
    val (x,y) = (1,2)

    val Array(a,b, _*) = Array(1,2,7,9)

    val map = Map("a"->1)
    for((k,v)<-map){

    }

    // 只取value为1的值
    for((k,1)<-map){

    }

    for((k,v)<-map if v==0){

    }
  }
}
