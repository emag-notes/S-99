package s99

object P27 {

  def group3[A](list: List[A]): List[List[List[A]]] =
    for {
      a <- P26.combinations(2, list)
      noA = list diff a
      b <- P26.combinations(3, noA)
    } yield List(a, b, noA diff b)

  def group[A](ns: List[Int], ls: List[A]): List[List[List[A]]] = ns match {
    case Nil => List(Nil)
    case n :: ns =>
      P26.combinations(n, ls) flatMap { c =>
        group(ns, ls diff c) map { c :: _ }
      }
  }

}
