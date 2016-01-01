package pl.edu.agh.iet.akka_tracing.tutorial.actors

import akka.actor.{ Actor, ActorRef, Props }
import pl.edu.agh.iet.akka_tracing.TracedActor

object SecondActor {
  def props(actorRef: ActorRef): Props = Props(classOf[SecondActor], actorRef)
}

class SecondActor(actorRef: ActorRef) extends Actor with TracedActor {
  override def receive: Receive = {
    case msg =>
      actorRef ! msg
  }
}
