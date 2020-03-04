package Battleships.com

implicit class BattleShipUtil {


  def userLocation()={
    var input = ""
    do{
      println("enter a position:= eg: ")
      input = scala.io.StdIn.readLine()
    }while(!isValidPosition(input))
    Tuple2.
  }

  def isValidPosition(string:String): Boolean ={
    string.matches("[0-9](,[0-9])")
  }
}
