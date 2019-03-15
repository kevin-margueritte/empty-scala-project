import sbt._

object Dependencies {

  object Version {
    val scalatestVersion  = "3.0.5"
    val catsEffectVersion = "1.2.0"
    val scalacheckVersion = "1.14.0"
  }

  val scalatest   = "org.scalatest"   %% "scalatest"    % Version.scalatestVersion  % Test
  val scalacheck  = "org.scalacheck"  %% "scalacheck"   % Version.scalacheckVersion % Test
  val catsEffect  = "org.typelevel"   %% "cats-effect"  % Version.catsEffectVersion

}
