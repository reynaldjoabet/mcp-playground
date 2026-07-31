import sbt.*

object Dependencies {

  private object Versions {

    val munit        = "1.3.4"
    val bouncycastle = "1.85"
    val password4j   = "1.8.4"
    val auth0        = "4.5.2"
    val nimbusJwt    = "10.9.1"
    val nimbusOidc   = "11.38.1"

  }
  lazy val munit      = "org.scalameta" %% "munit"      % Versions.munit
  lazy val auth0      = "com.auth0"      % "java-jwt"   % Versions.auth0
  lazy val password4j = "com.password4j" % "password4j" % Versions.password4j

  lazy val bouncycastle =
    "org.bouncycastle" % "bcpkix-jdk18on" % Versions.bouncycastle

  lazy val bouncycastleProvider =
    "org.bouncycastle" % "bcprov-jdk18on" % Versions.bouncycastle

  lazy val nimbusdsJoseJwt =
    "com.nimbusds" % "nimbus-jose-jwt" % Versions.nimbusJwt

  lazy val nimbusdsOauth2OidcSdk =
    "com.nimbusds" % "oauth2-oidc-sdk" % Versions.nimbusOidc

}
