package s99

class P26Spec extends BaseSpec {

  behavior of "combinations"

  it should "generate the combinations of K distinct objects chosen from the N elements of a list" in {
    val num    = 3
    val result = P26.combinations(num, List('a, 'b, 'c, 'd, 'e, 'f))
    assert(result.forall(_.size === num))
    assert(result.size === 20)
  }

}
