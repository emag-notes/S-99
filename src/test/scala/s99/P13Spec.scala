package s99

class P13Spec extends BaseSpec {

  behavior of "encodeDirect"

  it should "return a compressed list" in {
    assert(
      P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ===
        List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    )
  }

}
