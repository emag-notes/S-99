package s99

object P13 {

  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
      val (acc, next) = list span (_ == list.head)
      (acc.length, acc.head) :: encodeDirect(next)
    }
  }

}
