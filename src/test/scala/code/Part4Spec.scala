package code

import org.scalatest._

class Part4Spec extends WordSpec with Matchers with Part4TestCases {
  "part 4" should {
    "have tests" in {
      pending
    }
  }
}

trait Part4TestCases {
  val testCase4a: TestCase =
    TestCase(
      """
      #
      #  |  |  |  |  |  |  |  |  |
      #  |  |  |  |  |  |  |  |  |
      """.trim.stripMargin('#'),
      "711111111"
    )

  val testCase4b: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #  |  |  |  |  |  |  |  |  |
      #  |  |  |  |  |  |  |  |  |
      """.trim.stripMargin('#'),
      "777777177"
    )

  val testCase4c: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      # _|| || || || || || || || |
      #|_ |_||_||_||_||_||_||_||_|
      """.trim.stripMargin('#'),
      "200800000"
    )

  val testCase4d: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      # _| _| _| _| _| _| _| _| _|
      # _| _| _| _| _| _| _| _| _|
      """.trim.stripMargin('#'),
      "333393333 "
    )

  val testCase4e: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #|_||_||_||_||_||_||_||_||_|
      #|_||_||_||_||_||_||_||_||_|
      """.trim.stripMargin('#'),
      "888888888 AMB ['888886888', '888888880', '888888988']"
    )

  val testCase4f: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #|_ |_ |_ |_ |_ |_ |_ |_ |_
      # _| _| _| _| _| _| _| _| _|
      """.trim.stripMargin('#'),
      "555555555 AMB ['555655555', '559555555']"
    )

  val testCase4g: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #|_ |_ |_ |_ |_ |_ |_ |_ |_
      #|_||_||_||_||_||_||_||_||_|
      """.trim.stripMargin('#'),
      "666666666 AMB ['666566666', '686666666']"
    )

  val testCase4h: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _  _
      #|_||_||_||_||_||_||_||_||_|
      # _| _| _| _| _| _| _| _| _|
      """.trim.stripMargin('#'),
      "999999999 AMB ['899999999', '993999999', '999959999']"
    )

  val testCase4i: TestCase =
    TestCase(
      """
      #    _  _  _  _  _  _     _
      #|_||_|| || ||_   |  |  ||_
      #  | _||_||_||_|  |  |  | _|
      """.trim.stripMargin('#'),
      "490067715 AMB ['490067115', '490067719', '490867715']"
    )

  val testCase4j: TestCase =
    TestCase(
      """
      #    _  _     _  _  _  _  _
      # _| _| _||_||_ |_   ||_||_|
      #  ||_  _|  | _||_|  ||_| _|
      """.trim.stripMargin('#'),
      "123456789"
    )

  val testCase4k: TestCase =
    TestCase(
      """
      # _     _  _  _  _  _  _
      #| || || || || || || ||_   |
      #|_||_||_||_||_||_||_| _|  |
      """.trim.stripMargin('#'),
      "000000051"
    )

  val testCase4l: TestCase =
    TestCase(
      """
      #    _  _  _  _  _  _     _
      #|_||_|| ||_||_   |  |  | _
      #  | _||_||_||_|  |  |  | _|
      """.trim.stripMargin('#'),
      "490867715 "
    )
}
