package pl.edu.agh.iet.akka_tracing.tutorial.actors

import akka.actor.{ Actor, ActorRef, Props }
import pl.edu.agh.iet.akka_tracing.TracedActor

object FirstActor {
  def props(actorRef: ActorRef): Props = Props(classOf[FirstActor], actorRef)
}

class FirstActor(actorRef: ActorRef) extends Actor with TracedActor {
  override def receive: Receive = {
    case msg =>
      actorRef ! msg
  }
}
