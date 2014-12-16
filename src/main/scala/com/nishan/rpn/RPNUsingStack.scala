package com.nishan.rpn

import com.nishan.helper.RPNHelper

/**
 * Created by Nishan on 16-12-2014.
 */
object RPNUsingStack extends RPNHelper {

  def calculate(input: String): Double = {
    val items = input.split(" ")
    val stack = collection.mutable.Stack.empty[Double]
    import stack._
    for (i <- items) i match {
      case "+" => push(pop() + pop())
      case "-" => push((stack(1) - stack(0)))
      case "*" => push(pop() * pop())
      case "/" => push(stack(1) / stack(0))
      case "^" => push(math.pow(stack(1), stack(0)))
      case "%" => push(pop()/100)
      case "!" => push(!pop())
      case _ => {
        println("Push num onto top of stack  " + i.toDouble)
        push(i.toDouble)
      }
    }
    println("The final value is  " + stack(0))
    stack(0)
  }
}
