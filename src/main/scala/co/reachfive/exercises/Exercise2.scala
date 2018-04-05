package co.reachfive.exercises

object Exercise2 {
  def compress[T](list: List[T]): List[T] = {
    list match {
      case Nil => Nil
      case x :: Nil => x :: Nil
      case x :: y :: xs =>
        if(x == y)
          Exercise2.compress[T](y :: xs)
        else
          x :: Exercise2.compress[T](y :: xs)
    }
  }
}
