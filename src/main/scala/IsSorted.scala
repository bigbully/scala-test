/**
 * Created by bigbully on 15/2/6.
 */
object IsSorted extends App{

  def isSorted[@specialized T](array:Array[T], gt: (T, T) => Boolean): Boolean= {
    def test(list:List[T]):Boolean = {
      if (list.tail == Nil) {
        true
      }else if (!gt(list.head, list.tail.head)) {
        test(list.tail)
      }else {
        false
      }
    }

    val list = array.toList
    test(list)
  }

  println(isSorted(Array(1,2,3, 5), (x:Int, y:Int) => x > y))

}
