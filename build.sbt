name := "hello"

version := "1.0"

scalaVersion := "2.10.2"

// resolvers += "twitter.com" at "http://www.lag.net/nest"

// resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

// resolvers += "sbt-idea-repo" at "http://mpeltonen.github.io/maven/com/github/mpeltonen/"

resolvers += "TypeSafe" at "http://repo.typesafe.com/typesafe/repo"

// resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

// addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0")

// resolvers += "scala-tools-releases" at "https://repository.jboss.org/nexus/content/repositories/scala-tools-releases"



libraryDependencies ++= Seq(
	"net.sourceforge.jtds" % "jtds" % "1.2.4"
)


// libraryDependencies += "org.springframework" % "spring-jdbc" % "3.2.4.RELEASE"

// libraryDependencies += "com.twitter" % "querulous" % "2.7.6"  

// libraryDependencies += "play" %% "anorm" % "2.1.2"

libraryDependencies += "com.typesafe.slick" %% "slick" % "1.0.1"

