import Dependencies.*

scalaVersion := "3.3.7"
version := "0.1.0-SNAPSHOT"
//organization := "com.example"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings"
)

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
