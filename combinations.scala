def generateCombinations[T](elements: List[T]): List[List[T]] =
  elements.foldLeft(List(List.empty[T])) { (acc, element) =>
    acc.flatMap(combination => List(combination, combination :+ element))
  }.tail // Remove the empty list from the result

// Example usage:
val elements = List(1, 2, 3, 4)
val combinations = generateCombinations(elements)
println(combinations)
//output: List(List(4), List(3), List(3, 4), List(2), List(2, 4), List(2, 3), List(2, 3, 4), 
//..contd >>> List(1), List(1, 4), List(1, 3), List(1, 3, 4), List(1, 2), List(1, 2, 4), List(1, 2, 3), List(1, 2, 3, 4))


//its only powerset, combinations is subset of powerset. if i need to draw r from n combinations nCr = n!/(r!)(n-r!)
