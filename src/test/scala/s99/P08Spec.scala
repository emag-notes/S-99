package s99

import org.scalatest._

class P08Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "compress"

  it should "be replaced with a single copy of the element" in {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
  }

}
