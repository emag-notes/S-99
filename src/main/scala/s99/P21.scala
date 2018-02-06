package s99

object P21 {

  def insertAt[A](element: A, pos: Int, list: List[A]): List[A] = {
    val (pre, rest) = list.splitAt(pos)
    (pre :+ element) ::: rest
  }

}
