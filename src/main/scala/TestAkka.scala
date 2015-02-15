import akka.actor.{PoisonPill, Props, ActorSystem}

/**
 * Created by bigbully on 15/2/6.
 */
object TestAkka extends App{

  val system = ActorSystem("test")
  val watcher = system.actorOf(Props[WatchActor], "watcher")
  watcher ! "start"
  Thread.sleep(1000000)


}
