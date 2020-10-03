package test.h_matchCase

object TupleMatch {
  def main(args: Array[String]): Unit = {
    val pair = (1,0)

    val result =
    pair match{
      case (0,_)=>"0..."
      case (yy,0)=>"...0"
      case _=>"other"
    }

    print(result)
  }


}
