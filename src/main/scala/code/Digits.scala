package code

object Digits {
  def formatDigit(n: Int)(s: String): String =
    s.trim.stripMargin('#').split("\n").map(_.padTo(3 * n, ' ')).mkString

  val Digit1: String =
    formatDigit(1) {
      """
      #
      #  |
      #  |
      """
    }

  val Digit2: String =
    formatDigit(1) {
      """
      # _
      # _|
      #|_
      """
    }

  val Digit3: String =
    formatDigit(1) {
      """
      # _
      # _|
      # _|
      """
    }

  val Digit4: String =
    formatDigit(1) {
      """
      #
      #|_|
      #  |
      """
    }

  val Digit5: String =
    formatDigit(1) {
      """
      # _
      #|_
      # _|
      """
    }

  val Digit6: String =
    formatDigit(1) {
      """
      # _
      #|_
      #|_|
      """
    }

  val Digit7: String =
    formatDigit(1) {
      """
      # _
      #  |
      #  |
      """
    }

  val Digit8: String =
    formatDigit(1) {
      """
      # _
      #|_|
      #|_|
      """
    }

  val Digit9: String =
    formatDigit(1) {
      """
      # _
      #|_|
      # _|
      """
    }

  val Digit0: String =
    formatDigit(1) {
      """
      # _
      #| |
      #|_|
      """
    }
}
