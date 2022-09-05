import scala.util.control.Breaks._

object Q02 extends App{

  def gcd(x:Int,y:Int):Int = y match{
    case 0 => x
    case b if(y>x) => gcd(y,x)
    case _ => gcd(y,x%y)
  }

  def prime(n:Int,i:Int):Boolean= n match{
    case n if n==i => true
    case n if gcd(n,i)>1 => false
    case _  => prime(n,i+1)
  }

  def primeSeq(n:Int,i:Int){
    if(n==i) {
      break
    }
    if(prime(i,2)){
      println(i)
    }
    primeSeq(n,i+1)
  }

  print("Enter the Number : ")
  var n = scala.io.StdIn.readInt()

  primeSeq(n,2)

}