package code

import cats.implicits._

object Main {
  def parseInput(input: String) =
    "TODO: Implement me!"

  val example: String =
    """
    #    _  _     _  _  _  _  _
    #  | _| _||_||_ |_   ||_||_|
    #  ||_  _|  | _||_|  ||_| _|
    """.trim.stripMargin('#')

  def main(args: Array[String]): Unit =
    println(parseInput(example))
}
