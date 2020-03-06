package RockPaper
import scala.collection.mutable.Map
class RockPaperPlayer {
  var choices = Map[String, Double](HAND.ROCK -> 1, HAND.SCISSORS -> 1, HAND.PAPER -> 1, HAND.LIZARD -> 1, HAND.SPOCK -> 1)

  def getPlayerHand: String ={
    var input = ""
    do{
      println("Enter the hand you wish to play")
      println(HAND.toString())
      input = scala.io.StdIn.readLine().toLowerCase()
    }while(!HAND.ALLHANDS.contains(input))
    choices.foreach(keys => {
      if (keys._1 == input)
        choices.addOne(keys._1 -> (choices.get(keys._1).get+1.0))
    })
    input
  }


}
