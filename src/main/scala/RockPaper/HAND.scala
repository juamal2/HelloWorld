package RockPaper

object HAND extends Enumeration {
  val ROCK =("rock")
  val SCISSORS = ("scissors")
  val PAPER = ("paper")
  val LIZARD = ("lizard")
  val SPOCK = ("spock")
  val ALLHANDS = s"$ROCK, $SCISSORS, $PAPER, $LIZARD, $SPOCK"


  override def toString(): String = ALLHANDS
}
