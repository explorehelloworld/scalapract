object Solution {
  def imageSmoother(img: Array[Array[Int]]): Array[Array[Int]] = {
    val numRows = img.length
    val numCols = img(0).length

    def isValid(i: Int, j: Int): Boolean = i >= 0 && i < numRows && j >= 0 && j < numCols

    def smoothValue(i: Int, j: Int): Int = {
      val neighbors = for {
        di <- -1 to 1
        dj <- -1 to 1
        if isValid(i + di, j + dj)
      } yield img(i + di)(j + dj)

      neighbors.sum / neighbors.length
    }

    (for {
      i <- 0 until numRows
    } yield (for {
      j <- 0 until numCols
    } yield smoothValue(i, j)).toArray).toArray
  }
}


//need to add explanation later, this is ai generated. but you need to fully understand
