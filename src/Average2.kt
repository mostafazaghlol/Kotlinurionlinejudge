fun main(Args:Array<String>){
    var Fnum:Double = readLine()!!.toDouble()
    var Snum:Double = readLine()!!.toDouble()
    var Tnum:Double = readLine()!!.toDouble()
    var Average =  ((Fnum*2)+(Snum*3)+(Tnum*5)).div(10)
    var AverageNeeded = "%.1f".format(Average)
    println("MEDIA = $AverageNeeded")
}