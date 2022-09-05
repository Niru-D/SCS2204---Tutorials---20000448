object Q03 extends App{

  def addition(n:Int):Int = {
    if(n==0)
      0
    else
      n+addition(n-1)
  }

  print("Enter the Number : ")
  var n = scala.io.StdIn.readInt()

  println("addition : "+addition(n))

}