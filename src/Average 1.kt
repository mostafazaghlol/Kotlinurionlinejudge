fun main(Args:Array<String>){
    var num1:Double = readLine()!!.toDouble()
    var num2:Double = readLine()!!.toDouble()
    var avaerage:Double = ((num1*3.5)+(num2*7.5))/11
    var Ave = "%.5f".format(avaerage)
    println("MEDIA = $Ave")
}