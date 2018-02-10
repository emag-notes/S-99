package s99

object P24 {

  def lotto(num: Int, limit: Int): List[Int] =
    (for (_ <- 1 to num) yield (Math.random * limit).toInt).toList

}
