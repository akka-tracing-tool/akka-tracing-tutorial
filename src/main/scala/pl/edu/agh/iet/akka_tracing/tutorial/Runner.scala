package pl.edu.agh.iet.akka_tracing.tutorial

import akka.actor.{ ActorSystem, Props }
import pl.edu.agh.iet.akka_tracing.tutorial.actors.{ FirstActor, SecondActor, ThirdActor }

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.util.Random

object Runner {

  case class Message(integer: Int)

  def main(args: Array[String]) {
    val system = ActorSystem()
    val thirdActor = system.actorOf(Props[ThirdActor], "thirdActor")
    val secondActor = system.actorOf(SecondActor.props(thirdActor), "secondActor")
    val firstActor = system.actorOf(FirstActor.props(secondActor), "firstActor")

    for (x <- 1 to 10) {
      firstActor ! Message(Random.nextInt(10))
      Thread.sleep(300)
    }

    Await.result(system.terminate(), Duration.Inf)
  }
}
