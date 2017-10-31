
lazy val root = (project in file(".")).settings(
  organization := "com.greatdreams.example",
  name := "simple-scala-application-template",
  version := "1.0",
  scalaVersion := "2.12.4"
).disablePlugins(plugins.JUnitXmlReportPlugin)


(testOptions in Test) += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")

val logbackVersion = "1.2.3"
val groovyVersion = "2.4.10"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-core" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-classic" % s"${logbackVersion}",
  "ch.qos.logback" % "logback-access" % s"${logbackVersion}",
  "org.codehaus.groovy" % "groovy-all" % s"${groovyVersion}",

  "org.scalatest" %% "scalatest" % "3.0.4" % "test->*" excludeAll (
    ExclusionRule(organization = "org.junit", name = "junit")
    )
)

lazy val hello = taskKey[Unit]("An example project")
