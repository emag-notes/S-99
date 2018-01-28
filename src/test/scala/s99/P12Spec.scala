package s99

class P12Spec extends BaseSpec {

  behavior of "decode"

  it should "return an uncompressed one of given list" in {
    assert(
      P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) ===
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    )
  }

}
