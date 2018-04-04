package co.reachfive.exercises

object Exercise3 {
  def pack[T](list: List[T]): List[List[T]] = {

    var lastElt: Option[T] = None
    var packedList: List[List[T]] = List()
    var subPackedList: List[T] = List()

    list foreach (
      t => {
        if(lastElt.isDefined && (lastElt.get != t) ) {
          packedList :+= subPackedList
          subPackedList = List(t)
        } else {
          subPackedList :+= t
        }

        lastElt = Some(t)
      }
      )

    // last subPackedList has to be added
    // @TODO : check expected behavior for an empty List. There default behavior is List() => List(List())
    packedList :+= subPackedList

    packedList
  }
}
