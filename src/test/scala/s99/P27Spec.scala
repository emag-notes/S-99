package s99

class P27Spec extends BaseSpec {

  "group3" should "generate 3 disjoint subgroups for given list" in {
    val result = P27.group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    assert(result.size === 1260)
  }

  "group" should "generate N disjoint subgroups for given list" in {
    val result = P27.group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    assert(result.size === 756)
  }

}
