package s99

class P21Spec extends BaseSpec {

  behavior of "removeAt"

  it should "return a tuple which has a list and removed element" in {
    assert(
      P21.insertAt('new, 1, List('a, 'b, 'c, 'd)) ===
        List('a, 'new, 'b, 'c, 'd)
    )
  }

}
