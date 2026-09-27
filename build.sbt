import Dependencies.*

ThisBuild / scalaVersion := "3.9.0"
ThisBuild / version      := "0.1.0-SNAPSHOT"

ThisBuild / crossScalaVersions := Seq("3.3.8", "3.9.0")

ThisBuild / scalacOptions := Seq(
  "-encoding",
  "UTF-8",
  "-no-indent",
  "-deprecation",
  "-feature",
  "-unchecked",
  // "-Werror",
  // "-Wunused:all",
  "-Wvalue-discard",
  "-Wnonunit-statement",
  "-language:strictEquality",
  "-Xcheck-macros",
  "-Xmax-inlines:64"
)

Global / onChangedBuildSource := ReloadOnSourceChanges

publishMavenStyle := true
licenses          := Seq(License.Apache2)
homepage          := Some(uri("https://github.com/example/mcp-playground"))

lazy val root = rootProject
  .settings(
    name                 := "mcp-playground",
    libraryDependencies ++= Seq(
      munit % Test,
      bouncycastle,
      bouncycastleProvider,
      password4j,
      auth0,
      nimbusdsJoseJwt,
      nimbusdsOauth2OidcSdk
    )
  )
