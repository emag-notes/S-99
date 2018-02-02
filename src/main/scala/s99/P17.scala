package s99

object P17 {

  def split[A](num: Int, list: List[A]): (List[A], List[A]) = (num, list) match {
    case (_, Nil) => (Nil, Nil)
    case (0, xs)  => (Nil, xs)
    case (n, x :: xs) =>
      val (pre, post) = split(n - 1, xs)
      (x :: pre, post)
  }

}
