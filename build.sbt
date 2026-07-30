import Dependencies.*

scalaVersion := "3.3.8"
version := "0.1.0-SNAPSHOT"
//organization := "com.example"
ThisBuild / semanticdbEnabled := true

ThisBuild / scalacOptions := Seq(
  "-encoding",
  "UTF-8",
  "-no-indent",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-source:3.3",
  "-java-output-version:17",
  "-Werror",
  "-Wvalue-discard",
  "-Wnonunit-statement",
  "-Xlint:all",
  "-Xcheck-macros",
  "-Xmax-inlines:64"
)

Global / onChangedBuildSource := ReloadOnSourceChanges

publishMavenStyle := true
licenses := Seq(License.Apache2)
homepage := Some(url("https://github.com/example/mcp-playground"))

lazy val root = rootProject
  .settings(
    name := "mcp-playground",
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
