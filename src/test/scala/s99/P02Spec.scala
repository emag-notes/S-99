package s99

import org.scalatest._
import s99.P02._

class P02Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "penultimate"

  it should "get the last element of given List" in {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }

  it should "throw an exception if given empty list" in {
    an[IllegalArgumentException] should be thrownBy {
      penultimate(Nil)
    }
  }

}
