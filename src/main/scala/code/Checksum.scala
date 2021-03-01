package code

import cats.implicits._

object Checksum {
  type Result[A] = Either[String, A]

  private def parseDigit(digit: Char): Result[Int] =
    digit match {
      case '0' => Right(0)
      case '1' => Right(1)
      case '2' => Right(2)
      case '3' => Right(3)
      case '4' => Right(4)
      case '5' => Right(5)
      case '6' => Right(6)
      case '7' => Right(7)
      case '8' => Right(8)
      case '9' => Right(9)
      case chr => Left(s"Bad digit: $chr")
    }

  def calc(accountNumber: String): Result[Int] =
    accountNumber.toList.traverse(parseDigit).flatMap { digits =>
      if (digits.length == 9) {
        Right(digits.reverse.zipWithIndex.map { case (d, i) => d * (i + 1) }.sum % 11)
      } else {
        Left(s"Wrong number of digits in account number: ${digits.length}")
      }
    }

  def check(accountNumber: String): Result[Boolean] =
    calc(accountNumber).map(_ == 0)
}
