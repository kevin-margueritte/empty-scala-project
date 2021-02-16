import sbt._

object Dependencies {

  object Version {
    val scalatestVersion  = "3.2.2"
    val catsEffectVersion = "2.3.1"
    val scalacheckVersion = "1.14.1"
  }

  val scalatest   = "org.scalatest"   %% "scalatest"    % Version.scalatestVersion  % Test
  val scalacheck  = "org.scalacheck"  %% "scalacheck"   % Version.scalacheckVersion % Test
  val catsEffect  = "org.typelevel"   %% "cats-effect"  % Version.catsEffectVersion

}
