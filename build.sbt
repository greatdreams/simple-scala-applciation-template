organization := "com.greatdreams.example"

name := """simple-scala-application-template"""

version := "1.0"

scalaVersion := "2.11.8"

val logbackVersion = "1.1.7"
val groovyVersion = "2.4.7"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-core" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-classic" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-access" % s"${logbackVersion}",
  "org.codehaus.groovy" % "groovy-all" % s"${groovyVersion}",

  // Change this to another test framework if you prefer
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
