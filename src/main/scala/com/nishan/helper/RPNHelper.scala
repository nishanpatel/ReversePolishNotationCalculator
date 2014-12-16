package com.nishan.helper

import com.nishan.runtime.DoubleOps

/**
 * Created by Nishan on 16-12-2014.
 */
trait RPNHelper {

  def calculate(input: String): Double

  final val call2ArgOpp = Map("+" -> ((_:Double) + (_:Double)),
                              "-" -> (-(_:Double) + (_:Double)),
                              "*" -> ((_:Double) * (_:Double)),
                              "/" -> ((a:Double,b:Double) => b/a),
                              "^" -> ((a: Double, b: Double) => math.pow(b,a)))

  final val call1ArgOpp = Map("%" -> ((a: Double) => a/100),
                              "!" -> ((a: Double) => !a))

  //Helper function which will convert Double to DoubleOps and make prefix unary ! method available for double
  implicit def convertDoubleToDoubleOps(x: Double): DoubleOps = {
    new DoubleOps(x)
  }

}
