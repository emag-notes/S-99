package s99

import org.scalatest._
import s99.P03.nth

class P03Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "nth"

  val list = List(0, 1, 2, 3, 4, 5)

  it should "get the 0th element of given List" in {
    assert(nth(0, list) === 0)
  }

  it should "get the 2nd element of given List" in {
    assert(nth(2, list) === 2)
  }

  it should "throw an exception if given empty list" in {
    an[IllegalArgumentException] should be thrownBy {
      nth(2, Nil)
    }
  }

  it should "throw an exception if given negative index" in {
    an[IllegalArgumentException] should be thrownBy {
      nth(-1, list)
    }
  }

}
