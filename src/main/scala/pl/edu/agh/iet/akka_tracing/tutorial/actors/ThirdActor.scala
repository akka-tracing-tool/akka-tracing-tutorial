package pl.edu.agh.iet.akka_tracing.tutorial.actors

import akka.actor.Actor
import pl.edu.agh.iet.akka_tracing.TracedActor

class ThirdActor extends Actor with TracedActor {
  override def receive: Receive = {
    case msg =>
      println(s"${this.getClass.getSimpleName} received: $msg")
  }
}
