organization := "com.greatdreams.example"

name := """simple-scala-application-template"""

version := "1.0"

scalaVersion := "2.11.8"

val logbackVersion = "1.1.7"
val groovyVersion = "2.4.7"
// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-core" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-classic" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-access" % s"${logbackVersion}",
  "org.codehaus.groovy" % "groovy-all" % s"${groovyVersion}",

  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
