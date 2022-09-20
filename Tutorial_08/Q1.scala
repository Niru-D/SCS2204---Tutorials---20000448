case class Point(var x: Int, var y: Int) {

  def add(c:Point) = new Point(this.x + c.x, this.y + c.y)

  def move(c:Int, d:Int):Unit = {
    this.x = this.x + c
    this.y = this.y + d
  }

  def distance(c:Point) : Double = {
    var xDistance:Int = this.x - c.x
    var yDistance:Int = this.y - c.y
    var Distance: Int = xDistance*xDistance + yDistance*yDistance
    scala.math.sqrt(Distance)
  }

  def invert() :Unit = {
    var temp = this.x
    this.x = this.y
    this.y = temp
  }

}

object Q1 extends App {

  var a = Point(2,6)
  var b = Point(1,8)

  println
  println(a.add(b))

  a.move(2,-1)
  println(a)

  var d = a.distance(b)
  println(d)

  a.invert()
  println(a)
}