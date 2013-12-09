organization := "simplekanban"

name := "default"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq("-unchecked","-deprecation")

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-server" % "9.1.0.v20131115",
  "org.scalaz" %% "scalaz-core" % "6.0.3",
  "org.scalaz" %% "scalaz-http" % "6.0.3", 
  "org.scala-tools.testing" % "specs" % "1.6.2" % "test",
  "org.eclipse.jetty" % "jetty-webapp" % "9.1.0.v20131115" % "container",
  "org.eclipse.jetty" % "jetty-plus" % "9.1.0.v20131115" % "container"
)

seq(webSettings :_*)
