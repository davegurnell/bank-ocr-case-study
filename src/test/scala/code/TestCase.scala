package code

case class TestCase(actual: String, expected: String) {
  def tuple: (String, String) =
    (actual, expected)
}

object TestCase {
  // Editors like to strip trailing spaces from lines,
  // which messes up any test data written as a string literal.
  // This method replaces trailing spaces in a `string` of `num` digits:
  def formatDigits(num: Int)(string: String): String =
    string.trim
      .stripMargin('#')
      .split("\n")
      .map(_.padTo(3 * num, ' '))
      .mkString("\n")

  def create(actual: String, expected: String): TestCase =
    TestCase(formatDigits(9)(actual), expected)
}
