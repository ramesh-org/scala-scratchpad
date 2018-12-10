package design3

import collections.{Cons, List, Nil}

object List {

  //List(1,2) =>  List.apply(1,2)
  def apply[T](x1:T,x2:T): List[T] = new Cons(x1,new Cons(x2,new Nil))
  //List(1) =>  List.apply(1)
  def apply[T](x1:T):List[T]=new Cons(x1,new Nil)
  //
  def apply[T]()=new Nil[T]

}
