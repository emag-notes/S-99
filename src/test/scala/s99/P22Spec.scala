package s99

class P22Spec extends BaseSpec {

  behavior of "range"

  it should "return a list containing all integers within a given range" in {
    assert(
      P22.range(4, 9) === List(4, 5, 6, 7, 8, 9)
    )
  }

}
