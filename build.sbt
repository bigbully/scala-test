name := "scala-test2"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test" withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-actor" % "2.3.9" withSources(),
  "com.alibaba" % "fastjson" % "1.1.39"
)










