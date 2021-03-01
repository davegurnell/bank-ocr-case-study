package code

import org.scalatest._

class Part1Spec extends WordSpec with Matchers with Part1TestCases {
  "part 1" should {
    "have tests" in {
      pending
    }
  }
}

trait Part1TestCases {
  val testCase1a: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #| || || || || || || || || |
      #|_||_||_||_||_||_||_||_||_|
      """.stripMargin("#"),
      "000000000"
    )

  val testCase1b: TestCase =
    TestCase(
      """
      #
      #  |  |  |  |  |  |  |  |  |
      #  |  |  |  |  |  |  |  |  |
      """.stripMargin("#"),
      "111111111"
    )

  val testCase1c: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      # _| _| _| _| _| _| _| _| _|
      #|_ |_ |_ |_ |_ |_ |_ |_ |_
      """.stripMargin("#"),
      "222222222"
    )

  val testCase1d: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      # _| _| _| _| _| _| _| _| _|
      # _| _| _| _| _| _| _| _| _|
      """.stripMargin("#"),
      "333333333"
    )

  val testCase1e: TestCase =
    TestCase(
      """
      #
      #|_||_||_||_||_||_||_||_||_|
      #  |  |  |  |  |  |  |  |  |
      """.stripMargin("#"),
      "444444444"
    )

  val testCase1f: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #|_ |_ |_ |_ |_ |_ |_ |_ |_
      # _| _| _| _| _| _| _| _| _|
      """.stripMargin("#"),
      "555555555"
    )

  val testCase1g: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #|_ |_ |_ |_ |_ |_ |_ |_ |_
      #|_||_||_||_||_||_||_||_||_|
      """.stripMargin("#"),
      "666666666"
    )

  val testCase1h: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #  |  |  |  |  |  |  |  |  |
      #  |  |  |  |  |  |  |  |  |
      """.stripMargin("#"),
      "777777777"
    )

  val testCase1i: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #|_||_||_||_||_||_||_||_||_|
      #|_||_||_||_||_||_||_||_||_|
      """.stripMargin("#"),
      "888888888"
    )

  val testCase1j: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #|_||_||_||_||_||_||_||_||_|
      # _| _| _| _| _| _| _| _| _|
      """.stripMargin("#"),
      "999999999"
    )

  val testCase1k: TestCase =
    TestCase(
      """
      #    _  _     _  _  _  _  _
      #  | _| _||_||_ |_   ||_||_|
      #  ||_  _|  | _||_|  ||_| _|
      """.stripMargin("#"),
      "123456789"
    )
}
