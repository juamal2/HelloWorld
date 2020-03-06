package RockPaper



class RockPaper {

  def playHands(playerHand : String, aiHand: String)= Tuple2(playerHand, aiHand) match{
    case (HAND.ROCK, HAND.LIZARD | HAND.SCISSORS) => true
    case (HAND.PAPER, HAND.SPOCK | HAND.ROCK) => true
    case (HAND.SCISSORS, HAND.PAPER | HAND.LIZARD) => true
    case (HAND.LIZARD, HAND.PAPER | HAND.SPOCK) => true
    case (HAND.SPOCK, HAND.ROCK | HAND.SCISSORS) => true
    case (_,_) => false
  }

  def getWinner(result:Tuple2[Boolean,Boolean])= result match{
    case (true, false) => "Player has Won the game well Done"
    case (false, true) => "Ai has won the game you lost"
    case (false, false) => "A Draw nobody wins"
    case (true, true) => "??????"
    case (_,_) => "Something went wrong here"
  }

  def playGamePlayer(): Unit ={

    val player = new RockPaperPlayer
    val ai = new RockPaperAi(player.choices)
    var playing = true

    while (playing){
      println("Playing a hand of rock paper scissors Lizard spock")
      val playerChoice = player.getPlayerHand
      val aiChoice = ai.pickHand
      val playFunction = Tuple2(playHands(playerChoice,aiChoice) , playHands(aiChoice,playerChoice))


      println(s"Player used $playerChoice Computer used $aiChoice")
      println(getWinner(playFunction))

      ai.choices = player.choices

  }


  }


}
