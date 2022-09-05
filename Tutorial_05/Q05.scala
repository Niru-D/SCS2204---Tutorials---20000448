object Q05 extends App{

  def evenAddition(n:Int):Int={
    if(n%2==0){
      if(n==0)
        0
      else
        n+evenAddition(n-1)
    }
    else{
      evenAddition(n-1)
    }

  }

  print("Enter the Number : ")
  var n = scala.io.StdIn.readInt()

  println(evenAddition(n-1))

}