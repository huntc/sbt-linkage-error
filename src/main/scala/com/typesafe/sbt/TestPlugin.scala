package com.typesafe.sbt

object TestPlugin extends sbt.Plugin {
  throw new IllegalStateException("Something failed during init")
}
