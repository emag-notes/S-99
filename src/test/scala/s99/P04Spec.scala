package s99

import org.scalatest._

class P04Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "length"

  it should "get 6 with 6 elements" in {
    assert(P04.length(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  it should "get 0 with empty list" in {
    assert(P04.length(Nil) === 0)
  }

}
