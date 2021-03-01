# Case Study: Bank OCR

---

GOOD MORNING!

BACK IN A SEC... JUST GETTING COFFEE!

Please clone this repo and start reading through the README!

https://github.com/davegurnell/bank-ocr-case-study

---

Solve the problem below as a group using TDD.

The problem is taken from [codingdojo.org](http://codingdojo.org/kata/BankOCR/).

## Problem Specification

This kata involves a number of parts. I suggest solving each part one at a time. Only proceed to the next part once the previous one is complete.

Solving all the challenges will take a long time. I probably won't expect you to finish all of them in the time availabile.

### Part 1

You work for a bank, which has recently purchased a spiffy machine to assist in reading letters and faxes sent in by branch offices. The machine scans the paper documents, and produces a file with a number of entries which each look like this:

```
    _  _     _  _  _  _  _
  | _| _||_||_ |_   ||_||_|
  ||_  _|  | _||_|  ||_| _|
```

Each entry is 3 lines long, and each line has 27 characters. The first 3 lines of each entry contain an account number written using pipes and underscores, and the fourth line is blank. Each account number should have 9 digits, all of which should be in the range 0-9. A normal file contains around 500 entries.

Your first task is to write a program that can take this file and parse it into actual account numbers.

### Part 2

Having done that, you quickly realize that the ingenious machine is not in fact infallible. Sometimes it goes wrong in its scanning. The next step therefore is to validate that the numbers you read are in fact valid account numbers. A valid account number has a valid checksum. This can be calculated as follows:

```
account number:  3  4  5  8  8  2  8  6  5
position names:  d9 d8 d7 d6 d5 d4 d3 d2 d1

checksum calculation:
(d1+2*d2+3*d3 +..+9*d9) mod 11 = 0
```

So now you should also write some code that calculates the checksum for a given number, and identifies if it is a valid account number.

### Part 3

Your boss is keen to see your results. He asks you to write out a file of your findings, one for each input file, in this format:

```
457508000
664371495 ERR
86110??36 ILL
```

ie the file has one account number per row. If some characters are illegible, they are replaced by a ?. In the case of a wrong checksum, or illegible number, this is noted in a second column indicating status.

### Part 4

It turns out that often when a number comes back as ERR or ILL it is because the scanner has failed to pick up on one pipe or underscore for one of the figures. For example:

```
    _  _  _  _  _  _     _
|_||_|| || ||_   |  |  ||_
  | _||_||_||_|  |  |  | _|
```

The 9 could be an 8 if the scanner had missed one |. Or the 0 could be an 8. Or the 1 could be a 7. The 5 could be a 9 or 6. So your next task is to look at numbers that have come back as ERR or ILL, and try to guess what they should be, by adding or removing just one pipe or underscore. If there is only one possible number with a valid checksum, then use that. If there are several options, the status should be AMB. If you still can't work out what it should be, the status should be reported ILL.

## Clues

I recommend finding a way to write out 3x3 cells on 3 lines in your code, so they form an identifiable digits. Even if your code actually doesn't represent them like that internally. I'd much rather read

```
val digit4: String =
  """
  #
  #|_|
  #  |
  """.stripMargin("#")
```

than

```
val digit4: String =
  "   |_|  |"
```

anyday.

Some gotchas to avoid:

Be very careful to read the definition of checksum correctly. It is not a simple dot product, the digits are reversed from what you expect. The spec does not list all the possible alternatives for valid digits when one pipe or underscore has been removed or added. Don't forget to try to work out what a ? should have been by adding or removing one pipe or underscore.

## Rules of Mob Programming

- One keyboard, one screen
- One driver, many navigators
- Rotate driver every 15 minutes
- Everyone gets time at the keyboard
- Complete each part (plan, code, test) before moving on
- Take breaks when you need to

## Rules of TDD

- Don't write any production code
  unless it is to make a failing unit test pass.

- Don't write any more of a unit test
  than is sufficient to fail (compilation failures are failures).

- Don't write any more production code
  than is sufficient to pass the one failing unit test.

## References

- [Kata in the Coding Dojo Handbook](https://codingdojo.org/kata/BankOCR/)
- [Ruby version of the kata](https://github.com/dvrensk/bank_ocr_kata)
