package s99

object P15 {

  def duplicateN[A](num: Int, list: List[A]): List[A] = list.flatMap(e => repeated(source = e, n = num))

}
