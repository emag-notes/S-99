package s99

import org.scalatest._

class P11Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "encodeModified"

  it should "place in separate sub-lists." in {
    assert(
      P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ===
        List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
    )
  }

}
