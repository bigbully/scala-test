import akka.actor.{PoisonPill, Props, Terminated, Actor}
import akka.actor.Actor.Receive

/**
 * Created by bigbully on 15/2/6.
 */
class MyAct1 extends Actor{

  import context._

  override def receive: Receive = {
    case _ =>
  }

  @throws[Exception](classOf[Exception])
  override def postStop(): Unit = println("i am stopped")
}

class WatchActor extends Actor {
  import context._
  var lastSender = system.deadLetters
  def receive = {
    case "start" => val act = actorOf(Props(classOf[MyAct1]), "myAct")
//      context.watch(act) // <-- this is the only call needed for registration
      act ! PoisonPill
    case "kill" =>
      println("1")
//      context.stop(child); lastSender = sender()
    case Terminated(_) =>
//      lastSender ! "finished"
      println("2")
  }
}
