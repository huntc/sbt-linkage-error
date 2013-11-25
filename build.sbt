sbtPlugin := true

organization := "com.typesafe"

name := "test-plugin"

version := "1.0.0-SNAPSHOT"

scriptedSettings

scriptedLaunchOpts <+= version apply { v => s"-Dproject.version=$v" }
