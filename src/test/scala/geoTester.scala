package geo

import org.scalatest.FlatSpec

class geoAreaTest extends FlatSpec{

  "geoArea is passed 2 numbers" should
  "return a number equal to the two numbers multiplied together" in{
    val area = Geo.geoArea(10,4)
    assert(area == 40)
  }

  "geoPerim is passed 2 numbers" should
  "return a number equal to the numbers added together and multiplied by 2" in{
    val perim = Geo.geoPerim(20,50)
    assert(perim == 140)
  }

  "geoPy is passed 2 numbers" should
  "return a number equal to the square root of a squared plus b squared" in {
    val py = Geo.geoPy(3,4)
    assert(py == 5.0)
  }

  "geoTriArea is passed 2 numbers" should
  "return a number equal to the product of both numbers divided in half" in{
    val triArea = Geo.geoTriArea(9,4)
    assert(triArea == 18)
  }

  "geoTriPerim is passed 2 numbers" should
  "return a number equal to a plus b plus c" in{
    val triPerim = Geo.geoTriPerim(3,4)
    assert(triPerim == 12)
  }

}
