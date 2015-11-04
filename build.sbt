name := "supler-demo"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

sbtVersion := "0.13.9"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.4.0",
  "org.webjars" % "bootstrap" % "3.3.5",
  "com.softwaremill.supler" % "supler_2.11" % "0.3.0"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
