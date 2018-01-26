package s99

object P11 {

  def encodeModified[A](list: List[A]): List[Any] =
    P09
      .pack(list)
      .map {
        case l if l.lengthCompare(1) == 0 => l.head
        case l                            => (l.length, l.head)
      }

}
