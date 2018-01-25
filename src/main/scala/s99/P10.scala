package s99

object P10 {

  def encode[A](list: List[A]): List[(Int, A)] = P09.pack(list).map(l => (l.length, l.head))

}
