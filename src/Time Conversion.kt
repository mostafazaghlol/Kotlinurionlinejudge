fun main(args:Array<String>){
    var num:Int = readLine()!!.toInt()
    var hour= num.div(3600)
    num =  num.minus(hour*3600)
    var min = num.div(60)
    num =num.minus(min*60)
    println("$hour:$min:$num")

//nn
}