// "1" -> so there is one 1
// "1" -> "11" // there are two ones now
// "1" -> "11" -> "21"
// "1" -> "11" -> "21" -> "1211"
// "1" -> "11" -> "21" -> "1211" -> "111221" .-> "312211" like that

suppose val n = 6


val n = 6
(0 to n).foldLeft(List("1"))((acc,_) => {
  val l = acc.last
  acc :+ (l.tail.foldLeft(List((l.head,1)))((res, cur) => {
    if(res.last._1 == cur) res.init :+ (cur, res.last._2 + 1) else res :+ (cur, 1)
  }).map(f => f._2.toString + f._1.toString).mkString)
})
