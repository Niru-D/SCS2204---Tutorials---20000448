import scala.util.control.Breaks._

object Q06 extends App{

  def f(n:Int):Int={

    if(n<=1)
      n
    else
      f(n-1)+f(n-2)
  }

  def printFibonacciNums(n:Int,i:Int){

    if(n==i)
      break
    else
      println(f(i))
    printFibonacciNums(n,i+1)
  }

  print("Enter the Number : ")
  var n = scala.io.StdIn.readInt()

  printFibonacciNums(n,0)

}