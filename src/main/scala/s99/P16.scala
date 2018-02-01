package s99

object P16 {

  def drop[A](num: Int, list: List[A]): List[A] =
    list.zipWithIndex.filter(e => ((e._2 + 1) % num) != 0).map(_._1)

}
