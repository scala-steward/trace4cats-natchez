import sbt._

object Dependencies {
  object Versions {
    val scala212 = "2.12.15"
    val scala213 = "2.13.6"
    val scala3 = "3.1.0"

    val trace4cats = "0.12.0"

    val natchez = "0.1.5"

    val kindProjector = "0.13.2"
    val betterMonadicFor = "0.3.1"
  }

  lazy val trace4catsInject = "io.janstenpickle" %% "trace4cats-inject" % Versions.trace4cats

  lazy val natchez = "org.tpolecat" %% "natchez-core" % Versions.natchez

  lazy val kindProjector = ("org.typelevel" % "kind-projector"     % Versions.kindProjector).cross(CrossVersion.full)
  lazy val betterMonadicFor = "com.olegpy" %% "better-monadic-for" % Versions.betterMonadicFor
}
