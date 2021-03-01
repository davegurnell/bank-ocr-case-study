package code

import cats.implicits._

object BankOCR {
  val example: String =
    Digits.format(9) {
      """
      #    _  _     _  _  _  _  _
      #  | _| _||_||_ |_   ||_||_|
      #  ||_  _|  | _||_|  ||_| _|
      """
    }

  def main(args: Array[String]): Unit =
    println(Parser.parse(example))
}
