package co.reachfive.exercises

object Exercise1 {
  def flatten(list: List[Any]): List[Any] =
  {
    list match {
      case Nil => Nil
      case (x: List[Any]) :: xs => Exercise1.flatten(x) ++ Exercise1.flatten(xs)
      case x :: xs => x :: Exercise1.flatten(xs)
    }
  }
}
