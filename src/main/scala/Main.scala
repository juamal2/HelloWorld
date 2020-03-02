object Main{
  def returnMessage(msg:String): String= msg
  def returnAnything(item:Any) = item
  def endXofString(string:String, x:Int)={
    val str = string.substring(string.length()-x,string.length())
  }

  def getDrink(drink:String): String ={
    "I am the last Line I am  ^^  the returned value"
  }

  def isEven(number: Int): Boolean= {
    if (number % 2 == 0)
      true
    else
      false
  }

  def main(args: Array[String]): Unit = {
    println(returnMessage("hello world"))
    println(returnAnything("hello"))
    println(endXofString("pepsi", 2))
  }






}





