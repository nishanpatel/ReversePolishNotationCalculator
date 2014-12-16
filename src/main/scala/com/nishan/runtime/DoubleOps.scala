package com.nishan.runtime

/**
 * Created by Nishan on 16-12-2014.
 */
final class DoubleOps(self: Double) {

  def unary_!() : Double = { //factorial function. Make it unary prefix function
  def loop(acc: Double, self: Double): Double =
    if(self == 0.0) acc
    else loop(acc * self , self-1)

    loop(1.0 , self)
  }

}
