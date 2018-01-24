package s99

import org.scalatest._

class P09Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "pack"

  it should "place in separate sub-lists." in {
    assert(
      P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ===
        List(
          List('a, 'a, 'a, 'a),
          List('b),
          List('c, 'c),
          List('a, 'a),
          List('d),
          List('e, 'e, 'e, 'e)
        )
    )
  }

}
