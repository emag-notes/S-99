package object s99 {

  def repeated[A](source: A, n: Int): List[A] = {
    (for (_ <- 1 to n) yield source).toList
  }

}
