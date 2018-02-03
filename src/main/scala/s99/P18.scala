package s99

object P18 {

  def slice[A](from: Int, to: Int, list: List[A]): List[A] = (from, to, list) match {
    case (_, _, Nil)               => Nil
    case (_, e, _) if e <= 0       => Nil
    case (f, t, x :: xs) if f <= 0 => x :: slice(0, t - 1, xs)
    case (f, t, _ :: xs)           => slice(f - 1, t - 1, xs)
  }

}
