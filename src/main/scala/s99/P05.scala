package s99

object P05 {

  def reverse[A](list: List[A]): List[A] = {

    @annotation.tailrec
    def loop[B](acc: List[B], list: List[B]): List[B] = list match {
      case Nil     => acc
      case x :: xs => loop(x :: acc, xs)
    }

    loop(Nil, list)
  }

}
