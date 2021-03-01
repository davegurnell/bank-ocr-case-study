package code

object Digits {
  def format(num: Int)(string: String): String =
    string.trim
      .stripMargin('#')
      .split("\n")
      .map(_.padTo(3 * num, ' '))
      .mkString("\n")

  val Digit1: String =
    format(1) {
      """
      #
      #  |
      #  |
      """
    }

  val Digit2: String =
    format(1) {
      """
      # _
      # _|
      #|_
      """
    }

  val Digit3: String =
    format(1) {
      """
      # _
      # _|
      # _|
      """
    }

  val Digit4: String =
    format(1) {
      """
      #
      #|_|
      #  |
      """
    }

  val Digit5: String =
    format(1) {
      """
      # _
      #|_
      # _|
      """
    }

  val Digit6: String =
    format(1) {
      """
      # _
      #|_
      #|_|
      """
    }

  val Digit7: String =
    format(1) {
      """
      # _
      #  |
      #  |
      """
    }

  val Digit8: String =
    format(1) {
      """
      # _
      #|_|
      #|_|
      """
    }

  val Digit9: String =
    format(1) {
      """
      # _
      #|_|
      # _|
      """
    }

  val Digit0: String =
    format(1) {
      """
      # _
      #| |
      #|_|
      """
    }
}
