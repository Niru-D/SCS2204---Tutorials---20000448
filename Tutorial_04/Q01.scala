object Q01 extends App{
  println("Enter the deposit amount : ")
  var deposit = scala.io.StdIn.readDouble()

  def interest(d:Double):Double =
    d match{
       case d if d<20000 => d*0.02
       case d if d<200000 => d*0.04
       case d if d<2000000 => d*0.035
       case d if d>= 2000000 => d*0.065
    }

  println("The interest for the amount Rs."+deposit+" is Rs."+interest(deposit) )
}
