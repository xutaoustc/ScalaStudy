package test.h_matchCase

object TupleMatch {
  def main(args: Array[String]): Unit = {
    val pair = (1,0)

    val result =
    pair match{
      // 匹配二元组，第一个元素是0，但是第二个元素忽略
      case (0,_)=>"0..."
      // 匹配二元组，且第二个元素必须是0
      case (yy,0)=>"...0"
      case _=>"other"
    }

    print(result)
  }


}
