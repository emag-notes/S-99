package s99

object P28 {

  def lsort[A](list: List[List[A]]): List[List[A]] = list sortWith (_.length < _.length)

  def lsortFreq[A](list: List[List[A]]): List[List[A]] = {
    val freqs = Map(P10.encode(list map { _.length } sortWith { _ < _ }) map { _.swap }: _*)
    list sortWith { (e1, e2) =>
      freqs(e1.length) < freqs(e2.length)
    }
  }

}
