object Main{
  def returnMessage(msg:String): String= msg
  def returnAnything(item:Any) = item
  def endXofString(string:String, x:Int)={
    val str = string.substring(string.length()-x,string.length())
  }
  def superMulti(a:Int, b:Int, c:Int )={
    var nums = List(a,b,c).sorted
    (nums(0) + nums(1))*nums(2)
  }
  def twoStringReplace(str1:String, str2:String, char1:Char, char2:Char) ={
    var str = str1 + str2
    str.replace(char1, char2)
  }
  def addOrMultiNumber(num1:Int, num2:Int, add:Boolean) ={
    if (num1 == 0 && num2 != 0) num2
    else if (num1 != 0 && num2 == 0) num1
    else if (add) num1+num2 else num1*num2
  }
  def isEven(number: Int): Boolean= {
    if (number % 2 == 0)
      true
    else
      false
  }
  def repeatString(str:String, count:Int) ={
    for (i <- 1 to count) println(str)
  }
  def repeatStringRec(str:String, count:Int) ={

  }



  def main(args: Array[String]): Unit = {

    println(superMulti(2,7,4))


  }






}





