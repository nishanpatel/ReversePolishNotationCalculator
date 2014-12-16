package com.nishan.rpn

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Nishan on 17-12-2014.
 */
class RPNUsingMapCall$Test extends FlatSpec with Matchers {

  it should "be able to calculate + and - operations on given input" in {
    RPNUsingMapCall.calculate("1 2 3 + -") should equal(-4)
  }

  it should "be able to calculate * and / operations on given input" in {
    RPNUsingMapCall.calculate("6 2 * 3 /") should equal(4)
  }

  it should "be able to calculate ^ and + operations on given input" in {
    RPNUsingMapCall.calculate("2 3 ^ 4 5 + +") should equal(17)
  }

  it should "be able to calculate % and * operations on given input" in {
    RPNUsingMapCall.calculate("50 % 2 *") should equal(1)
  }

  it should "be able to calculate !, * and + operations on given input" in {
    RPNUsingMapCall.calculate("3 ! 4 5 * +") should equal(26)
  }

  it should "be able to calculate / and ! operations on given input" in {
    RPNUsingMapCall.calculate("12 3 / !") should equal(24)
  }

  it should "be able to calculate complex numbers" in {
    RPNUsingMapCall.calculate("5 1 2 + 4 * + 3 -") should equal(14)
  }

  it should "be able to handle negative numbers" in {
    RPNUsingMapCall.calculate("-25 5 /") should equal(-5)
  }
}
