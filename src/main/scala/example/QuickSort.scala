package example

object QuickSort {
  def sort(xs: Array[Int]) {
    def swap(i: Int, j: Int) {
      val t = xs(i); xs(i) = xs(j); xs(j) = t
    }
    def quickSort(l: Int, r: Int) {
      val pivot = xs((l + r) / 2)
      var i = l; var j = r
      while (i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) quickSort(l, j)
      if (j < r) quickSort(i, r)
    }
    quickSort(0, xs.length - 1)
  }

  def main(args:Array[String]){
    val array=Array(5,1,2,3,4)
    sort(array)
    for(e :Int<-array){
      println(e)
    }
  }
}
