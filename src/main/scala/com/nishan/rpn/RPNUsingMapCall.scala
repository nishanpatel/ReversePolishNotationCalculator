package com.nishan.rpn

import com.nishan.helper.RPNHelper

/**
 * Created by Nishan on 16-12-2014.
 */
object RPNUsingMapCall extends RPNHelper {

  def calculate(input: String): Double = {
    val items = input.split(" ")
    val stack = collection.mutable.Stack.empty[Double]
    import stack._

    for (i <- items) i match {
      case "+" | "-" | "*" | "/" | "^" => push(call2ArgOpp(i)(pop(), pop()))
      case "%" | "!" => push(call1ArgOpp(i)(pop()))
      case _ => push(i.toDouble)
    }

    println("The final value is  " + stack(0))
    stack(0)
  }
}
