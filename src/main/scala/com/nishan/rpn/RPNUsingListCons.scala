package com.nishan.rpn

import com.nishan.helper.RPNHelper

/**
 * Created by Nishan on 16-12-2014.
 */
object RPNUsingListCons extends RPNHelper {

  def calculate(input: String): Double = {
    val inpList = input.split(" ")
    val acc = List[Double]()
    inpList.foldLeft(acc)(foldLeftAndMatch).head
  }

  def foldLeftAndMatch(resList: List[Double], elem: String): List[Double] =  resList match {
    case List() => elem.toDouble :: Nil
    case x::y::ys => elem match {
      case "+" => x + y :: ys
      case "-" => y - x :: ys
      case "*" => x * y :: ys
      case "/" => y / x :: ys
      case "^" => math.pow(y, x) :: ys
      case _ => elem.toDouble :: resList
    }
    case x::xs => elem match {
      case "%" => x/100.0 :: xs
      case "!" => !x :: xs
      case _ => elem.toDouble :: resList
    }
    case List(_) => elem.toDouble :: resList
  }
}
