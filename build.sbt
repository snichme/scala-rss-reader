name := "rss"

version := "0.1"

scalaVersion := "2.10.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.18",
  "com.typesafe.slick" %% "slick" % "1.0.0",
  "com.typesafe.akka" %% "akka-actor" % "2.1.4"
)


