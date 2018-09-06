fun main(args:Array<String>){
    var number :Int = readLine()!!.toInt()
    var hours:Int = readLine()!!.toInt()
    var perHour:Double = readLine()!!.toDouble()
    var salary = "%.2f".format(perHour*hours)
    println("NUMBER = $number\nSALARY = U\$ $salary")
}