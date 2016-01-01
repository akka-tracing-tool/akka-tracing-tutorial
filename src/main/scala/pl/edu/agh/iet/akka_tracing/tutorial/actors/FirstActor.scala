package pl.edu.agh.iet.akka_tracing.tutorial.actors

import akka.actor.{ActorRef, Props, Actor}

object FirstActor {
  def props(actorRef: ActorRef): Props = Props(classOf[FirstActor], actorRef)
}

class FirstActor(actorRef: ActorRef) extends Actor {
  override def receive: Receive = {
    case msg =>
      actorRef ! msg
  }
}
