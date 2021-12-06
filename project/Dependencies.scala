import sbt._

object Dependencies {

  object Version {
    val scalatestVersion  = "3.2.10"
    val catsEffectVersion = "3.3.0"
    val scalacheckVersion = "1.15.4"
  }

  val scalatest   = "org.scalatest"   %% "scalatest"    % Version.scalatestVersion  % Test
  val scalacheck  = "org.scalacheck"  %% "scalacheck"   % Version.scalacheckVersion % Test
  val catsEffect  = "org.typelevel"   %% "cats-effect"  % Version.catsEffectVersion

}
