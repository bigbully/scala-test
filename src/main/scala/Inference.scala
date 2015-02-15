/**
 * Created by bigbully on 15/2/12.
 */
object Inference extends App{

  def test1[T](i:T, f: T => Boolean): Unit = {
    println("1")
  }

  def test2[T](i:T)(f: T => Boolean): Unit = {
    println("1")
  }

  /*test1(1, _ > 0)*/
  println(test2(1)_)

}
