package code

import cats.implicits._

object Main {
  type Result[A] = Either[String, A]

  def parseDigit(digit: String, index: Int): Result[String] =
    digit match {
      case Digits.Digit0 => Right("0")
      case Digits.Digit1 => Right("1")
      case Digits.Digit2 => Right("2")
      case Digits.Digit3 => Right("3")
      case Digits.Digit4 => Right("4")
      case Digits.Digit5 => Right("5")
      case Digits.Digit6 => Right("6")
      case Digits.Digit7 => Right("7")
      case Digits.Digit8 => Right("8")
      case Digits.Digit9 => Right("9")
      case other         => Left(s"Digit $index unrecognised: $other")
    }

  def parseInput(input: String): Result[String] = {
    def inputToLines: Result[List[String]] =
      input.split("\n").toList match {
        case List(a, b, c) =>
          Right(List(a, b, c))

        case _ =>
          Left("Wrong number of lines in input")
      }

    def lineToTriplets(line: String): Result[List[String]] = {
      val triplets: List[String] =
        line.padTo(3 * 9, ' ').grouped(3).toList

      if (triplets.length == 9) {
        Right(triplets)
      } else {
        Left(s"Wrong number of characters in line")
      }
    }

    def transposeTriplets(triplets: List[List[String]]): Result[List[String]] =
      triplets match {
        case List(a, b, c) =>
          Right((a, b, c).zipped.map { case (a, b, c) => s"$a$b$c" }.toList)

        case _ =>
          Left("Wrong number of lines in transposeTriplets")
      }

    for {
      lines <- inputToLines
      _ = println("lines = " + lines)
      triplets <- lines.traverse(lineToTriplets)
      _ = println("triplets = " + triplets)
      digits <- transposeTriplets(triplets)
      _ = println("digits = " + digits)
      digits <- digits.zipWithIndex.traverse { case (digit, index) => parseDigit(digit, index) }
      _ = println("digits = " + digits)
    } yield digits.mkString
  }

  val example: String =
    """
    #    _  _     _  _  _  _  _
    #  | _| _||_||_ |_   ||_||_|
    #  ||_  _|  | _||_|  ||_| _|
    """.trim.stripMargin('#')

  def main(args: Array[String]): Unit =
    println(parseInput(example))
}
