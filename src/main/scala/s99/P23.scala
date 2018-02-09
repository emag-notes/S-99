package s99

object P23 {

  def randomSelect[A](num: Int, list: List[A]): List[A] = {

    def randomSelect1(num: Int, length: Int, list: List[A]): List[A] = {
      if (num == 0) List[A]()
      else if (num > 0) {
        val (rest, e) = P20.removeAt((Math.random * length).toInt, list)
        e :: randomSelect1(num - 1, length - 1, rest)
      } else throw new IllegalArgumentException("num must not negative")
    }

    val length = P04.length(list)
    if (num <= length) randomSelect1(num, length, list) else sys.error("")
  }

}
