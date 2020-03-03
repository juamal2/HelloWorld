import java.util
import java.util.Collections
import scala.util.Random
import scala.io.Source
import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

object Main{
  /*
   *    Day 1-------------------------Day 1
   */
  def returnMessage(msg:String): String= msg
  def returnAnything(item:Any) = item
  def endXofString(string:String, x:Int)={
    val str = string.substring(string.length()-x,string.length())
  }
  def superMulti(a:Int, b:Int, c:Int )={
    val nums = List(a,b,c).sorted
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
    for (i <- 1 to count) {
      println()
      for (i <- 1 to count) print(str)
    }
  }


def recursionRepeat(str:String, count:Int): Int ={
  if (count > 0){ 0
  } else {
    recursionRepeat(str, count) - 1
    count
  }
}
def patternMatch(input :Any) = input match{
  case input @ List(_,_) => println(input.reverse)
  case input @ (_,_) => println(input.swap)
  case input @ Array(_,_) => println(input(1) + "," + input(0))
  case _ => println("failed")
}
  def replaceHidden(str:String, char:Set[Char])={
  var result = str
  for (s <- result.toCharArray ){
    if (!char.contains(s)){
      result = result.replace(s,'_')
    }
  }
  result.toString
  }
  def checkUnderScore(str:String) ={
    str.contains("_")
  }
  def getWord()={
    var strList = List(for (line <- Source.fromFile("wordstxt").getLines) yield line).toList
    strList(0)
  }


def GetLongestWord(file:String, letters:String)={
  var letterArray= letters.toSet
  var Result = ArrayBuffer[String]()
  for (line <- Source.fromFile(file).getLines) {
    var str = line.toSet
    if (str.subsetOf(letterArray)){
      Result.append(line)
    }
  }
  Result.maxBy(_.length)
}




  def main(args: Array[String]): Unit = {
    var playing:Boolean = true
    val hangWord:String = "Penguin".toLowerCase
    var charArray = Set[Char]()
    var displayWord:String = replaceHidden(hangWord, charArray)
    var lives = 10
    println("your word is:" + hangWord.length + " long")
    while (playing){
      println("words already used: " + charArray.toString())
      println("progress made: " + displayWord)
      println("you have: " + lives + " lives left")
      println("next char please: ")
      charArray = charArray+scala.io.StdIn.readChar()
      var lastWord = displayWord
      displayWord = replaceHidden(hangWord, charArray)
      println(displayWord)
      if (!checkUnderScore(displayWord)) {
        println("yay you Won")
        playing = false
      }else if(lives < 1){
        println("yay you Lost")
        playing = false;
      }else if (lastWord != displayWord)lives -= 1
    }
  }






}





