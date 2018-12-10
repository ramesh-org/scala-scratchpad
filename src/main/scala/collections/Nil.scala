package collections

class Nil[T] extends List[T]{
  override def isEmpty: Boolean = true

  override def head: Nothing = throw new NoSuchElementException("head.Nil")

  override def tail: Nothing = throw new NoSuchElementException("tail.Nil")

  override def hashCode(): Int = super.hashCode()

  override def equals(obj: Any): Boolean = super.equals(obj)
}
