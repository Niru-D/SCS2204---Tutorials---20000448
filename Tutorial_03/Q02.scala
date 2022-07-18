object Q02 extends App{

  var celsius:Double = 35
  def celsiusToFahrenheit (c:Double) : Double = c*1.8 + 32.0

  println("The fahrenheit value of "+celsius+"C : "+celsiusToFahrenheit(celsius)+"F")

}