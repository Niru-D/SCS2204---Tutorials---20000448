object Q03 extends App{

  var radius:Int = 5
  var pi:Double = 3.14

  def volume (r:Int):Double = (4* pi*r*r*r)/3
  println("Volume of a sphere with "+radius+" radius : "+volume(radius))
}