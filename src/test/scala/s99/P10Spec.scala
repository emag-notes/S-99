package s99

import org.scalatest._

class P10Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "pack"

  it should "place in separate sub-lists." in {
    assert(
      P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ===
        List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    )
  }

}
