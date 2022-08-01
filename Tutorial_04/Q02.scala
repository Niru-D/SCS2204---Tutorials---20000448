object Q02 extends App{
  println("Enter the integer : ")
  var intVal = scala.io.StdIn.readInt()

  def integer(i:Int):String =
    i match{
      case i if i<=0 => "Negative/Zero is given"
      case i if i%2==0 => "Even number is given"
      case i if i%2 !=0 => "Odd number is given"
    }

  println(integer(intVal))

}
