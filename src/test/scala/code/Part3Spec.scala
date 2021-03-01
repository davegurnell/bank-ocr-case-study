package code

import org.scalatest._

class Part3Spec extends WordSpec with Matchers with Part3TestCases {
  "part 3" should {
    "have tests" in {
      pending
    }
  }
}

trait Part3TestCases {
  val testCase3a: TestCase =
    TestCase(
      """
      # _  _  _  _  _  _  _  _
      #| || || || || || || ||_   |
      #|_||_||_||_||_||_||_| _|  |
      """.stripMargin("#"),
      "000000051"
    )

  val testCase3b: TestCase =
    TestCase(
      """
      #    _  _  _  _  _  _     _
      #|_||_|| || ||_   |  |  | _
      #  | _||_||_||_|  |  |  | _|
      """.stripMargin("#"),
      "49006771? ILL"
    )

  val testCase3c: TestCase =
    TestCase(
      """
      #    _  _     _  _  _  _  _
      #  | _| _||_| _ |_   ||_||_|
      #  ||_  _|  | _||_|  ||_| _
      """.stripMargin("#"),
      "1234?678? ILL"
    )
}
