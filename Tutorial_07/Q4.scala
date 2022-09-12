object Q4 extends App {

  val acc1= new BankAccount1("A001",200134,20000.00)
  val acc2= new BankAccount1("A002",200456,3000.00)
  val acc3= new BankAccount1("A003",200555,15000.00)
  val acc4= new BankAccount1("A004",200111,-6000.00)

  var bank:List[BankAccount1]=List(acc1,acc2,acc3,acc4)

  val negbalance = bank.filter(a=>a.balance<0)
  val totbalance = bank.map((a)=>(a.balance)).reduce((a,b)=>(a+b))
  val interest = (b:List[BankAccount1])=>b.map((a) => (a.ID,a.accountnumber,if(a.balance>0)  (a.balance+(a.balance*0.5)) else (a.balance+(a.balance*0.1)) ))

  print("Accounts with negative balance: ")
  println(negbalance)
  print("Sum of all account balances: ")
  println(totbalance)
  print("Final balances with interest: ")
  println(interest(bank))

}

class BankAccount1(id:String,n:Int,b:Double){

  var ID:String=id
  var accountnumber:Int =n
  var balance:Double =b

  override def toString = "[ ID : "+ID+", Account Number : "+accountnumber+", Balance : "+balance+" ]"


}
