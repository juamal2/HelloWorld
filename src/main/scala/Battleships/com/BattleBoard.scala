package Battleships.com

class BattleBoard {
  val boardnodes = Array.ofDim[Shipnode](8, 8)


  def addShip() ={
  }

  def fill() = {
    for {i <- 0 until boardnodes.length
         j <- 0 until boardnodes.length} {
      boardnodes(i)(j) = new Shipnode()
    }
  }

  def display(board : Array[Array[Shipnode]]): Unit = {
    for (i <- 0 until boardnodes.length) {
      for (j <- 0 until boardnodes.length) print(boardnodes(i)(j).innerText + " ")
      print("\n")
    }
  }

  def isValidShip(ship: Ship) ={

  }
}
