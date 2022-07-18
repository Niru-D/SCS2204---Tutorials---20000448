object Q04 extends App{

  var noOfCopies:Int = 60

  def totalCoverPrice (n:Int) : Double = n*24.95
  def discount (n:Int) : Double = totalCoverPrice(n)*0.4
  def shippingCost (n:Int) : Double = n*3 + (n-50)*0.75 - (n-50)*3
  def totalWholesaleCost (n:Int) :Double = totalCoverPrice(n)-discount(n)+shippingCost(n)

  println("Total wholesale cost for "+noOfCopies+" copies : Rs."+totalWholesaleCost(noOfCopies))

}
