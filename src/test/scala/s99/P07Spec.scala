package s99

import org.scalatest._

class P07Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "flatten"

  it should "flatten nested list" in {
    assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }

}
