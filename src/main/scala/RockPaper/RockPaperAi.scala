package RockPaper

import scala.util.Random
import scala.collection.mutable.Map

class RockPaperAi(var choices: Map[String, Double]) {

  val percentages = scala.collection.mutable.Map[String, Double]()

  def getPercentages{
    var total = 0.0
    for (choice <- choices){
      total += choice._2
    }
    for (choice <- choices){
      percentages.addOne((choice._1 -> (choice._2/total)*100))
    }

  }

  def pickHandFromPercentages: String ={
    getPercentages
    val choice = Random.nextInt(100)
    var counter = 0.0
    var result = ""
    for (percent <- percentages){
      counter += percent._2
      if ((choice < counter) & (result == "")) result = percent._1
    }
    result
  }

  def pickHandCounter(hand:String )=hand match{
    case (HAND.ROCK) => if (Random.nextBoolean()) HAND.PAPER else HAND.SPOCK
    case (HAND.PAPER) => if (Random.nextBoolean()) HAND.SCISSORS else HAND.LIZARD
    case (HAND.SCISSORS) => if (Random.nextBoolean()) HAND.ROCK else HAND.SPOCK
    case (HAND.LIZARD) => if (Random.nextBoolean()) HAND.ROCK else HAND.SCISSORS
    case (HAND.SPOCK) => if (Random.nextBoolean()) HAND.LIZARD else HAND.PAPER
    case _ => "Something went Wrong here"
  }

  def pickHand: String ={
    pickHandCounter(pickHandFromPercentages)
  }

}

