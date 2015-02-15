import scala.annotation.tailrec

/**
 * Created by bigbully on 15/2/6.
 */
object Fibonacci extends App{

  def getN (n:Int) :Int = {
    if (n == 1){
      0
    }else if (n == 2){
      1
    }else {
      fab(0, 1, n - 2)
    }
  }


  @tailrec def  fab(a1:Int, a2:Int, index:Int): Int = {
    if (index == 0) {
      a1 + a2
    }else {
      fab(a2, a1 + a2, index - 1)
    }
  }


  println(getN(6))

}
