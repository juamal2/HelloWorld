package Battleships.com

import scala.collection.mutable.ArrayBuffer

class Ship(val size: Int ,val  vertical: Boolean,val position: Tuple2[Int,Int] ) {



  def getNodes(): ArrayBuffer[Tuple2[Int,Int]]={
    var positions = ArrayBuffer[Tuple2[Int,Int]]()
    for (i <- 0 until size){
      if (vertical) {positions.append(Tuple2(position._1, position._2-(size/2)+i))}
      else{positions.append(Tuple2(position._1-(size/2)+i, position._2))}
    }
    println(positions.toString())
    positions
  }










}
