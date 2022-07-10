object Q4b extends App{

  def attendees(ticket:Int):Int= 120+(15-ticket)/5*20
  def revenue(ticket:Int):Int= attendees(ticket)*ticket
  def cost(ticket:Int):Int = 500 + 3 * attendees(ticket)
  def profit (ticket:Int):Int = revenue(ticket)-cost(ticket)

  println("ticket prize:5, profit: " +profit(5))
  println("ticket prize:10, profit: "+profit(10))
  println("ticket prize:15, profit: "+profit(15))
  println("ticket prize:20, profit: "+profit(20))
  println("ticket prize:25, profit: "+profit(25))
  println("ticket prize:30, profit: "+profit(30))
  println("ticket prize:35, profit: "+profit(35))
  println("ticket prize:40, profit: "+profit(40))


}
