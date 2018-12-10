package design

object Empty extends IntSet {
  override def incl(x: Int): IntSet = new NonEmpty(x,Empty,Empty)
  override def contains(x: Int): Boolean = false

  override def union(other: IntSet): IntSet = other

  override def toString: String = "."
}
