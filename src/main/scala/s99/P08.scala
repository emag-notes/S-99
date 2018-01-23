package s99

object P08 {

  def compress[A](list: List[A]): List[A] = {

    @annotation.tailrec
    def loop[B](acc: List[B], cur: List[B]): List[B] = cur match {
      case x :: xs => loop(acc :+ x, xs.dropWhile(_ == x))
      case Nil     => acc
    }

    loop(Nil, list)
  }

}
