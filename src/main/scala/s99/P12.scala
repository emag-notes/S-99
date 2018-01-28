package s99

object P12 {

  def decode[A](list: List[(Int, A)]): List[A] = list.flatMap(e => repeated(n = e._1, source = e._2))

  private def repeated[A](source: A, n: Int): List[A] = {
    (for (_ <- 1 to n) yield source).toList
  }

}
