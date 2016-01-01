name := "akka-tracing-tutorial"
version := "1.0"
scalaVersion := "2.10.5"

val AkkaVersion = "2.3.9"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion
)
