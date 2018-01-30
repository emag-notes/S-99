package s99

class P14Spec extends BaseSpec {

  behavior of "duplicate"

  it should "return a duplicated list" in {
    assert(
      P14.duplicate(List('a, 'b, 'c, 'c, 'd)) ===
        List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    )
  }

}
