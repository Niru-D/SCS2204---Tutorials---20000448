object Q4a extends App{
  var nHours:Int = 6
  var otHours:Int = 3

  def normalSal (nHours:Int):Int = nHours*150
  def otSal (otHours:Int):Int = otHours*75
  def income (h1:Int,h2:Int):Int = normalSal(h1)+otSal(h2)
  def tax (income:Int):Double = income*0.1
  def takeHome (h1:Int,h2:Int):Double = income(h1,h2) - tax(income(h1, h2))

  println("Take home salary of the employee : Rs."+takeHome(nHours,otHours))

}