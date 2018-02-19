package s99

object P26 {

  def combinations[A](num: Int, list: List[A]): List[List[A]] = {

    def flatMapSublists[B, C](l: List[B])(f: (List[B]) => List[C]): List[C] =
      l match {
        case Nil                   => Nil
        case sublist @ (_ :: tail) => f(sublist) ::: flatMapSublists(tail)(f)
      }

    if (num == 0) List(Nil)
    else
      flatMapSublists(list) { subList =>
        combinations(num - 1, subList.tail) map { subList.head :: _ }
      }
  }

}
