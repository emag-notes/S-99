package s99

object P04 {

  def length[A](list: List[A]): Int = {

    @annotation.tailrec
    def loop[B](acc: Int, list: List[B]): Int = list match {
      case Nil     => acc
      case _ :: xs => loop(acc + 1, xs)
    }

    loop(0, list)
  }

}
