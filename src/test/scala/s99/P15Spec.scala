package s99

class P15Spec extends BaseSpec {

  behavior of "duplicateN"

  it should "return a duplicated list" in {
    assert(
      P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) ===
        List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    )
  }

}
