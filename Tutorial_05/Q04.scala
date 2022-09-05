object Q04 extends App{

  def isEven(n:Int):Boolean= {
    if(n==0){
      true
    }
    else if(n==1){
      false
    }
    else if(n<0){
      isEven(-n);
    }
    else
      isEven(n-2);
  }

  print("Enter the Number : ")
  var n = scala.io.StdIn.readInt()

  if (isEven(n)){
    print("even")
  }
  else{
    print("odd")
  }

}