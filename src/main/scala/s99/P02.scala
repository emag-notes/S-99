package s99

object P02 {

  def penultimate[A](list: List[A]): A = list match {
    case x :: _ :: Nil => x
    case _ :: xs       => penultimate(xs)
    case _             => throw new IllegalArgumentException("list must be not empty")
  }

}
