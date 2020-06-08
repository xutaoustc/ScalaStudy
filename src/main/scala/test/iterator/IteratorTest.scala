package test.iterator

object IteratorTest {
  def main(args:Array[String]):Unit={
    val list = List(1,2,3,4)

    // iterator 再map还是一个iterator
    val i =
    list.iterator.map(x=>{
      println("first")
      x
    }).map(x=>{
      println("second")
      x
    })

    while(i.hasNext){
      println(i.next())
    }

    i.foreach(println)

    /*
    * first
      second
      1
      first
      second
      2
      first
      second
      3
      first
      second
      4
    * */
  }
}
