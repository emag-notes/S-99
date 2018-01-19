package s99

import org.scalatest._

class P05Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "reverse"

  it should "get reversed list" in {
    assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
  }

}
