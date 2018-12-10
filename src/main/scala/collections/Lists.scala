package collections

object Lists {

  //This method returns sum of all elements in the list
  def sum(xs: List[Int]): Int = {
    if(xs.isEmpty)
      throw new Error("Error: List is empty")
    var sum: Int = 0
    var tmp=xs;
    while (!tmp.isEmpty){
      sum=sum+tmp.head
      tmp=tmp.tail
    }
    sum
  }

  //This method returns the largest element in a list of integers
  def max(xs: List[Int]): Int = {
    if(xs.isEmpty)
      throw new Error("Error: List is empty")
    var element: Int = Int.MinValue
    var tmp=xs;
    while (!tmp.isEmpty){
      if(tmp.head>element)
        element=tmp.head
      tmp=tmp.tail
    }
    element
  }

  def nth[T](index:Int,list:List[T]):T={
    if(list.isEmpty)
      throw new IndexOutOfBoundsException
    else if(index==0)
      list.head
    else
      nth(index-1,list.tail)
  }
}
