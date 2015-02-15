/**
 * Created by bigbully on 15/2/10.
 */
object Partial extends App{

  def partial1[A, B, C](a:A, f:(A, B) => C):B =>C = {
    b:B  => f(a, b)
  }

  def curry[A, B, C](f:(A, B) => C) :A => (B => C) ={
    a =>  b =>f(a, b)
  }

  def uncurry[A, B, C](f:A => B => C):(A, B) => C = {
    (a, b) => f(a)(b)
  }

  def compose[A, B, C] (f:B => C, g:A => B) : A => C = {
    a:A  => f(g(a))
  }

  val f = (x:Long) => x.toString
  val g = (x:String) => x.toInt + 2
  val h = f andThen g
  println(h(2L))


}
