package s99

object P03 {

  def nth[A](index: Int, list: List[A]): A = list match {
    case x :: _ if index == 0 => x
    case _ :: xs if index > 0 => nth(index - 1, xs)
    case _ if list.isEmpty    => throw new IllegalArgumentException("list must be not empty")
    case _ if index < 0       => throw new IllegalArgumentException("index must be greater than or equal to zero")
  }

}
