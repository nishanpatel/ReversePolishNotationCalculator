package com.nishan.rpn

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Nishan on 17-12-2014.
 */
class RPNUsingStack$Test extends FlatSpec with Matchers {

  it should "be able to calculate + and - operations on given input" in {
    RPNUsingStack.calculate("1 2 3 + -") should equal(-4)
  }

  it should "be able to calculate * and / operations on given input" in {
    RPNUsingStack.calculate("6 2 * 3 /") should equal(4)
  }

  it should "be able to calculate ^ and + operations on given input" in {
    RPNUsingStack.calculate("2 3 ^ 4 5 + +") should equal(17)
  }

  it should "be able to calculate % and * operations on given input" in {
    RPNUsingStack.calculate("50 % 2 *") should equal(1)
  }

  it should "be able to calculate !, * and + operations on given input" in {
    RPNUsingStack.calculate("3 ! 4 5 * +") should equal(26)
  }

  it should "be able to calculate / and ! operations on given input" in {
    RPNUsingStack.calculate("12 3 / !") should equal(24)
  }

  it should "be able to calculate complex numbers" in {
    RPNUsingStack.calculate("5 1 2 + 4 * + 3 -") should equal(14)
  }

  it should "be able to handle negative numbers" in {
    RPNUsingStack.calculate("-25 5 /") should equal(-5)
  }
}
