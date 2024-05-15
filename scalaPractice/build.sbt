ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "scalaPractice",
    libraryDependencies+= " \"org.apache.spark\" %% \"spark-core\" % \"3.2.0\",
  )
