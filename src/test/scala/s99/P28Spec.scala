package s99

class P28Spec extends BaseSpec {

  "lsort" should "sort the elements of the list according to their length" in {
    assert(
      P28.lsort(
        List(List('a, 'b, 'c),
             List('d, 'e),
             List('f, 'g, 'h),
             List('d, 'e),
             List('i, 'j, 'k, 'l),
             List('m, 'n),
             List('o))
      ) ===
        List(List('o),
             List('d, 'e),
             List('d, 'e),
             List('m, 'n),
             List('a, 'b, 'c),
             List('f, 'g, 'h),
             List('i, 'j, 'k, 'l))
    )
  }

  "lsortFreq" should "" in {
    assert(
      P28.lsortFreq(
        List(List('a, 'b, 'c),
             List('d, 'e),
             List('f, 'g, 'h),
             List('d, 'e),
             List('i, 'j, 'k, 'l),
             List('m, 'n),
             List('o))
      ) === List(List('i, 'j, 'k, 'l),
                 List('o),
                 List('a, 'b, 'c),
                 List('f, 'g, 'h),
                 List('d, 'e),
                 List('d, 'e),
                 List('m, 'n))
    )
  }
}
