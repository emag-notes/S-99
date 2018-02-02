package s99

class P17Spec extends BaseSpec {

  behavior of "split"

  it should "return a split list" in {
    assert(
      P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ==
        (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    )
  }

}
