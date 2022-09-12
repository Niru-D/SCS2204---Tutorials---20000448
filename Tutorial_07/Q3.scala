object Q3 extends App{
  val acc1= new BankAccount("A001",200134,20000.00)
  val acc2= new BankAccount("A002",200456,3000.00)

  acc1.transfer(acc2,2000.00)
  println("Balances After money transfer :")
  println(acc1)
  println(acc2)
}

class BankAccount(id:String,n:Int,b:Double){

  var ID:String=id
  var accNum:Int =n
  var balance:Double =b

  def withdraw(n:Double){
    this.balance=this.balance-n
  }

  def deposit(n:Double){
    this.balance=this.balance+n
  }

  def transfer(acc:BankAccount,n:Double)={
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "[ ID : "+ID+", Account Number : "+accNum+", Balance : "+balance+" ]"

}