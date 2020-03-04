package Battleships.com

class BattleBoard {
  val boardPlayer = Array.ofDim[Shipnode](8, 8)
  val boardAi = boardPlayer.clone()



  def addShip() ={

  }

  def fill() = {
    var boardnode = boardPlayer
    for {i <- 0 until boardnode.length
         j <- 0 until boardnode.length} {
      boardnode(i)(j) = new Shipnode()
    }
  }

  def display(): Unit = {
    var boardnode = boardPlayer
    for (i <- 0 until boardnode.length) {
      for (j <- 0 until boardnode.length) print(boardnode(i)(j).innerText + " ")
      print("\n")
    }
  }

  def isValidShip(ship: Ship) ={

  }
}
