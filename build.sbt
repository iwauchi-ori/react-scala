name := """play-scala-myapp"""
organization := "com.shota.play"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.14"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
// libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.18"
libraryDependencies ++= Seq(
  "org.apache.pekko" %% "pekko-protobuf-v3" % "1.0.1",
  "org.apache.pekko" %% "pekko-slf4j" % "1.0.1",
)
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.shota.play.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.shota.play.binders._"
