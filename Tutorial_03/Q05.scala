object Q05 extends App{

  def easyPaceTime (distance:Int):Int = distance*8
  def tempoPaceTime (distance:Int):Int = distance*7

  println("Total running time : " + (easyPaceTime(2)+tempoPaceTime(3)+easyPaceTime(2))+" min")

}