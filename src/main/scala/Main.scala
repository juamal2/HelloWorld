object Main{
  def returnMessage(msg:String): String= msg
  def returnAnything(item:Any) = item
  def endXofString(string:String, x:Int)={
    val str = string.substring(string.length()-x,string.length())
  }
  def superMulti(a:Int, b:Int, c:Int )={
    var nums = List(a,b,c)
    nums = nums.sorted
    (nums(0) + nums(1))*nums(2)
  }
  def twoStringReplace(str1:String, str2:String, char1:Char, char2:Char) ={
    var str = str1 + str2
    str.replace(char1, char2)
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
    println(superMulti(2,7,4))
    println(twoStringReplace("pepsi", "bopple", 'p', 't'))
  }






}





