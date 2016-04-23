package geo

import scala.math

object Geo {
  def geoArea(a: Int, b: Int): Int = a * b

  def geoPerim(a: Int, b: Int): Int = (a + b) * 2

  def geoPy(a: Int, b: Int): Double  = {
    val c: Int = ((a * a) + (b * b))
    math.sqrt(c)
  }

  def geoTriArea(a: Int, b: Int): Int = ((a*b)/2)

  def geoTriPerim(a: Int, b: Int): Double = {
    val c: Double = Geo.geoPy(a, b)
    a + b + c
  }
}
