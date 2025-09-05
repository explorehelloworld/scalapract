// Factorial without recursion, loops
def fact(n: Int) = (1 to n).reduce(_ * _)

//fibonacci series with less code // use foldleft to print only last number of fib series
def fib(n: Int) = (1 to n).scanLeft((0,1))((acc,cur) => (acc._1+acc._2, acc._1)).map(_._1).mkString(",")

//Given two arrays to find anagram delta on each parallel element // "hat", "art" has delta 1 (if we change 'h' to 'r')
val x = List("meme", "hellx", "world", "ss")
val y = List("emem", "lehho", "world", "x")

// List(0,1,0,-1)
val z = x.zip(y).map(f => if(f._1.length != f._2.length) -1 else f._1.sorted.zip(f._2.sorted)
.foldLeft(0)((acc,cur) => if(cur._1!=cur._2) (acc+1) else (acc)))
