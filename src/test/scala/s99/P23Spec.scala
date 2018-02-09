package s99

class P23Spec extends BaseSpec {

  behavior of "range"

  it should "return a list containing all integers within a given range" in {
    val num = 3
    assert(
      P23.randomSelect(num, List('a, 'b, 'c, 'd, 'f, 'g, 'h)).size === num
    )
  }

}
