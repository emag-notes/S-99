package s99

import org.scalatest._

class P06Spec extends FlatSpec with Matchers with DiagrammedAssertions {

  behavior of "isPalindrome"

  it should "be true with given a palindrome list" in {
    assert(P06.isPalindrome(List(1, 2, 3, 2, 1)))
  }

  it should "be true with emptylist" in {
    assert(P06.isPalindrome(Nil))
  }

  it should "be false with given a not palindrome list" in {
    assert(P06.isPalindrome(List(2, 2, 3, 2, 1)) === false)
  }

}
