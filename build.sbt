organization := "com.greatdreams.example"

name := """simple-scala-application-template"""

version := "1.0"

scalaVersion := "2.12.1"

val logbackVersion = "1.1.7"
val groovyVersion = "2.4.7"

val myproject = (project in file(".")).disablePlugins(plugins.JUnitXmlReportPlugin)
(testOptions in  Test) += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-core" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-classic" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-access" % s"${logbackVersion}",
  "org.codehaus.groovy" % "groovy-all" % s"${groovyVersion}",

  // Change this to another test framework if you prefer

  "org.scalatest" %% "scalatest" % "3.0.0" % "test->*" excludeAll(
    ExclusionRule(organization = "org.junit", name="junit")
    )
)
