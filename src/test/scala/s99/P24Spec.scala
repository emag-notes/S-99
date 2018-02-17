package s99

class P24Spec extends BaseSpec {

  behavior of "range"

  it should "draw N different random numbers from the set 1..M." in {
    val num    = 6
    val limit  = 49
    val result = P24.lotto(num, limit)
    assert(result.size === num)
    assert(result.max <= limit)
  }

}
