import mill._
import $ivy.`com.lihaoyi::mill-contrib-playlib:`,  mill.playlib._

object cloudbox extends PlayModule with SingleModule {

  def scalaVersion = "3.3.1"
  def playVersion = "2.9.0-RC3"
  def twirlVersion = "1.6.0-RC2"

  object test extends PlayTests
}
