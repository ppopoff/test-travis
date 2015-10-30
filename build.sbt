name := "test-travis"

organization := "org.doingfp"

version := "1.0"

scalaVersion := "2.11.7"

mainClass in (Compile, run) := Some("Main")

scalaSource in Compile := baseDirectory.value / "src" / "main"

scalaSource in Test := baseDirectory.value / "src" / "test"

//mainClass in (Compile, packageBin) := Some("Main")

libraryDependencies ++= compileDeps

libraryDependencies ++= testDeps

val compileDeps = Seq(
  "com.datastax.cassandra" % "cassandra-driver-core" % "2.1.8"
)

val testDeps = Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.5" % Test
)

