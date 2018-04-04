package co.reachfive.exercises

object Exercise2 {
  def compress[T](list: List[T]): List[T] = {

    var lastElt: Option[T] = None
    var compressedList: List[T] = List()

    list foreach (
      t => {
        if(lastElt.isEmpty || (lastElt.get != t) ) {
          compressedList :+= t
          lastElt = Some(t)
        }
      }
      )

    compressedList
  }
}
