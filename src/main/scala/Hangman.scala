import scala.io.Source
import scala.util.Random

class Hangman {

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
    var strList = (for (line <- Source.fromFile("wordstxt").getLines) yield line).toList
    strList(Random.nextInt(strList.length))
  }
  def hangman() ={
    var playing:Boolean = true
    val hangWord:String = getWord().toLowerCase
    var charArray = Set[Char]()
    var displayWord:String = replaceHidden(hangWord, charArray)
    var lives = 10
    println("your word is:" + hangWord.length + " long")
    while (playing){
      println ("words already used: " + charArray.toString())
      println("progress made: " + displayWord)
      println("you have: " + lives + " lives left")
      println("next char please: ")
      var lastWord = charArray
      charArray = charArray+scala.io.StdIn.readChar()
      displayWord = replaceHidden(hangWord, charArray)
      println(displayWord)
      if (!checkUnderScore(displayWord)) {
        println("yay you Won")
        println("your word was:" + hangWord )
        playing = false
      }else if(lives < 1){
        println("yay you Lost")
        println("your word was:" + hangWord )
        playing = false;
      }else if (lastWord != charArray)lives -= 1
    }
  }

  def main(args: Array[String]): Unit = {
    hangman()
  }

}
