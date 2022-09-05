object Q01 extends App{

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

  print("Enter the Number : ")
  var n = scala.io.StdIn.readInt()

  println(prime(n,2))

}
