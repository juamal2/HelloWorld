package Battleships.com

object Utils{
  implicit class BattleShipUtil(any :Any) {
    def userLocation() = {
      var input = ""
      do {
        println("enter a position:= eg: ")
        input = scala.io.StdIn.readLine()
      } while (!isValidPosition(input))
      Tuple2(input.charAt(0).getNumericValue-1 ,input.charAt(2).getNumericValue -1)
    }
    def isValidPosition(string: String): Boolean = {
      string.matches("[0-9](,[0-9])")
    }
  }

}
