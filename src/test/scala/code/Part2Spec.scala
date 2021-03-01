package code

import org.scalatest._
import org.scalatest.prop._

class Part2Spec extends WordSpec with Matchers with TableDrivenPropertyChecks {
  val testCases =
    Table(
      ("accountNumber", "checksum", "valid"),
      ("000000000", 0, true),
      ("111111111", 1, false),
      ("222222222", 2, false),
      ("333333333", 3, false),
      ("444444444", 4, false),
      ("123456789", 0, true)
    )

  "Checksum.{calc, check}" should {
    "work" in {
      forAll(testCases) { (accountNumber, checksum, valid) =>
        Checksum.calc(accountNumber) shouldBe Right(checksum)
      }
    }
  }

  "Checksum.calc" should {
    "work" in {
      forAll(testCases) { (accountNumber, checksum, valid) =>
        Checksum.check(accountNumber) shouldBe Right(valid)
      }
    }
  }
}
