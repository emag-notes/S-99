package s99

class P16Spec extends BaseSpec {

  behavior of "drop"

  it should "return a dropped list" in {
    assert(
      P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ===
        List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    )
  }

}
