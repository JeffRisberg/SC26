name := "SC26"

version := "1.0"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies ++=
  Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT",
    "org.specs2" %% "specs2-core" % "3.6.2" % "test")

resolvers ++=
  Seq("Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
    "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases")