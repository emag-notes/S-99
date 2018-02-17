package s99

class P25Spec extends BaseSpec {

  behavior of "randomPermute"

  it should "generate a random permutation of the elements of a list." in {
    val input  = List('a, 'b, 'c, 'd, 'e, 'f)
    val result = P25.randomPermute(input)
    assert(result.size === input.size)
    assert(result !== input)
    assert(result.map(_.name).sorted === input.map(_.name).sorted)
  }

}
