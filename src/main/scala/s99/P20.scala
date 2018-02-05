package s99

object P20 {

  def removeAt[A](num: Int, list: List[A]): (List[A], A) = {
    val (pre, rest) = list.splitAt(num)
    (pre ::: rest.tail, list(num))
  }

}
