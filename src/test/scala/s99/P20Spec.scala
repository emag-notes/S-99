package s99

class P20Spec extends BaseSpec {

  behavior of "removeAt"

  it should "return a tuple which has a list and removed element" in {
    assert(
      P20.removeAt(1, List('a, 'b, 'c, 'd)) === (List('a, 'c, 'd), 'b)
    )
  }

}
