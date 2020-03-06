package Battleships.com

import scala.collection.mutable.ArrayBuffer

class BattleBoard {
  val boardnodes = Array.ofDim[Shipnode](8, 8)
  val ships = ArrayBuffer[Ship]()

  def addShip() ={
    var getlocation = Utils.userLocation()
    if (isValidShip(new Ship(5, true, getlocation))) ships.append(new Ship(5, true, getlocation))
  }

  def fill() = {
    for {i <- 0 until boardnodes.length
         j <- 0 until boardnodes.length} {
      boardnodes(i)(j) = new Shipnode()
    }
  }
def udpate(): Unit ={
  for (ship <- ships){
    for (i <- ship.getNodes()){
      boardnodes(i._2)(i._1).isShip = true
      boardnodes(i._2)(i._1).innerText = "S"
    }
  }
}
  def display(): Unit = {
    for (i <- 0 until boardnodes.length) {
      for (j <- 0 until boardnodes.length) print(boardnodes(i)(j).innerText + " ")
      print("\n")
    }
  }

  def isValidBoardPosition(tuple2: Tuple2[Int,Int]): Boolean ={
    if ((tuple2._1 >= 0 & tuple2._1 <= 8) & (tuple2._2 >= 0 & tuple2._2 <= 8)) true else false
  }
  def isValidShip(ship: Ship): Boolean={
    if ((for (s <- ship.getNodes()) yield isValidBoardPosition(s)).toString().contains("false"))false else true

  }
}
