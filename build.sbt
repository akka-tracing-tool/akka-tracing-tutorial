name := "akka-tracing-tutorial"
version := "1.0"
scalaVersion := "2.11.11"

val AkkaVersion = "2.4.17"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-remote" % AkkaVersion,
  "org.xerial" % "sqlite-jdbc" % "3.8.11.1"
)

lazy val root = (project in file(".")).enablePlugins(AkkaTracingPlugin)