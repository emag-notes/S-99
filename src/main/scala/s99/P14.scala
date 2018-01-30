package s99

object P14 {

  def duplicate[A](list: List[A]): List[A] = list.flatMap(e => List(e, e))

  def duplicate2[A](list: List[A]): List[A] = {
    if (list.isEmpty) Nil
    else {
      list.head :: list.head :: duplicate2(list.tail)
    }
  }

}
