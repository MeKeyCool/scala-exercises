package co.reachfive.exercises

object Exercise1 {
  def flatten(list: List[Any]): List[Any] =
  {
    var b: List[Any] = List()

    list foreach {
      // @TODO: this recursive usage will imply to flatten List(List(List(a))) into List(a); Check if it is expected behavior
      case l: List[Any] => Exercise1.flatten(l) foreach (a => b = b :+ a)
      case a: Any => b = b :+ a
    }

    b
  }
}
