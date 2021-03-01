package code

import org.scalatest._
import org.scalatest.prop._

class Part1Spec extends WordSpec with Matchers with Part1TestCases with TableDrivenPropertyChecks {
  "Parser.parse" should {
    "handle the built-in test cases" in {
      val testCases =
        Table(
          ("actual", "expected"),
          testCase1a.tuple,
          testCase1b.tuple,
          testCase1c.tuple,
          testCase1d.tuple,
          testCase1e.tuple,
          testCase1f.tuple,
          testCase1g.tuple,
          testCase1h.tuple,
          testCase1i.tuple,
          testCase1j.tuple,
          testCase1k.tuple
        )

      forAll(testCases) { (actual, expected) =>
        Parser.parse(actual) shouldBe Right(expected)
      }
    }
  }
}

trait Part1TestCases {
  val testCase1a: TestCase =
    TestCase.create(
      """
      # _  _  _  _  _  _  _  _  _
      #| || || || || || || || || |
      #|_||_||_||_||_||_||_||_||_|
      """,
      "000000000"
    )

  val testCase1b: TestCase =
    TestCase.create(
      """
      #
      #  |  |  |  |  |  |  |  |  |
      #  |  |  |  |  |  |  |  |  |
      """,
      "111111111"
    )

  val testCase1c: TestCase =
    TestCase.create(
      """
      # _  _  _  _  _  _  _  _  _
      # _| _| _| _| _| _| _| _| _|
      #|_ |_ |_ |_ |_ |_ |_ |_ |_
      """,
      "222222222"
    )

  val testCase1d: TestCase =
    TestCase.create(
      """
      # _  _  _  _  _  _  _  _  _
      # _| _| _| _| _| _| _| _| _|
      # _| _| _| _| _| _| _| _| _|
      """,
      "333333333"
    )

  val testCase1e: TestCase =
    TestCase.create(
      """
      #
      #|_||_||_||_||_||_||_||_||_|
      #  |  |  |  |  |  |  |  |  |
      """,
      "444444444"
    )

  val testCase1f: TestCase =
    TestCase.create(
      """
      # _  _  _  _  _  _  _  _  _
      #|_ |_ |_ |_ |_ |_ |_ |_ |_
      # _| _| _| _| _| _| _| _| _|
      """,
      "555555555"
    )

  val testCase1g: TestCase =
    TestCase.create(
      """
      # _  _  _  _  _  _  _  _  _
      #|_ |_ |_ |_ |_ |_ |_ |_ |_
      #|_||_||_||_||_||_||_||_||_|
      """,
      "666666666"
    )

  val testCase1h: TestCase =
    TestCase.create(
      """
      # _  _  _  _  _  _  _  _  _
      #  |  |  |  |  |  |  |  |  |
      #  |  |  |  |  |  |  |  |  |
      """,
      "777777777"
    )

  val testCase1i: TestCase =
    TestCase.create(
      """
      # _  _  _  _  _  _  _  _  _
      #|_||_||_||_||_||_||_||_||_|
      #|_||_||_||_||_||_||_||_||_|
      """,
      "888888888"
    )

  val testCase1j: TestCase =
    TestCase.create(
      """
      # _  _  _  _  _  _  _  _  _
      #|_||_||_||_||_||_||_||_||_|
      # _| _| _| _| _| _| _| _| _|
      """,
      "999999999"
    )

  val testCase1k: TestCase =
    TestCase.create(
      """
      #    _  _     _  _  _  _  _
      #  | _| _||_||_ |_   ||_||_|
      #  ||_  _|  | _||_|  ||_| _|
      """,
      "123456789"
    )
}
