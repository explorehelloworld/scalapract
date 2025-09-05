def permutations[T](list: List[T]): List[List[T]] = {
  list.foldLeft(List(List.empty[T])) { (acc, element) =>
    acc.flatMap(permutation => (0 to permutation.length).map(i => permutation.take(i) ++ List(element) ++ permutation.drop(i)))
  }.tail // Removing the initial empty list
}

val myList = List(1, 2, 3)
val result = permutations(myList)
println(result)
