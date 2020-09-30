package test.function

object AbstractControl {
  def main(args: Array[String]): Unit = {
    alwaysCatch{
      1
    }
  }



  def alwaysCatch(op: =>Unit):Unit={
    try {
      op
    }catch{
      case e: Exception => println ("error")
    }
  }
}
