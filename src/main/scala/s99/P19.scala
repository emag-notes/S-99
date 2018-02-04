package s99

object P19 {

  def rotate[A](num: Int, list: List[A]): List[A] = {
    val nBounded = if (list.isEmpty) 0 else num % list.length
    if (nBounded < 0) rotate(nBounded + list.length, list)
    else (list drop nBounded) ::: (list take nBounded)
  }

}
