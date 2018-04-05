package co.reachfive.exercises

object Exercise3 {
  def pack[T](list: List[T]): List[List[T]] = {
    list match {
      case Nil => Nil
      case x :: Nil => (x :: Nil) :: Nil
      case x :: y :: xs =>
        if(x == y)
          Exercise3.pack[T](y :: xs) match {
            case Nil => Nil                     // avoid a compilation warning, but should not happen here
            case l :: lxs => (x :: l) :: lxs
          }
        else
          ((x :: Nil) :: Nil) ++ Exercise3.pack[T](y :: xs)
    }
  }
}
