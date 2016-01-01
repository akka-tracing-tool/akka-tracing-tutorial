package pl.edu.agh.iet.akka_tracing.tutorial.actors

import akka.actor.Actor

class ThirdActor extends Actor {
  override def receive: Receive = {
    case msg =>
      println(s"${this.getClass.getSimpleName} received: $msg")
  }
}
