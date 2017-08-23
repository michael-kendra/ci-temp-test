lazy val root = (project in file(".")).
  aggregate(app).
  settings(inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3"
    )),
    name := "ci-temp-test-root"
  )

lazy val app = (project in file("app")).
  settings(
    name := "ci-temp-test",
    libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )
