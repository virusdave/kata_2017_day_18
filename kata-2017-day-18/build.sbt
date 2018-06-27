import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "kata-2017-day-18",
    libraryDependencies ++= Seq(
      "com.beachape" %% "enumeratum" % "1.5.13",
      scalaTest % Test
    )
  )
