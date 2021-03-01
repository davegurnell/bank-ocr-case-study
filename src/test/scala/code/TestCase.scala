package code

case class TestCase(actual: String, expected: String)

object TestCase {
  def formatDigits(n: Int)(s: String): String =
    s.trim.stripMargin('#').split("\n").map(_.padTo(3 * n, ' ')).mkString

  def create(actual: String, expected: String): TestCase =
    TestCase(formatDigits(9)(actual), expected)
}
