package s99

class P18Spec extends BaseSpec {

  behavior of "slice"

  it should "return a sliced list" in {
    assert(
      P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ===
        List('d, 'e, 'f, 'g)
    )
  }

}
