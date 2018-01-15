package s99

import org.scalatest.{DiagrammedAssertions, FlatSpec, Matchers}
import s99.P01._

class P01Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "last"

  it should "get the last element of given List" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
  }

  it should "throw an exception if given empty list" in {
    an[IllegalArgumentException] should be thrownBy {
      last(Nil)
    }
  }

}
