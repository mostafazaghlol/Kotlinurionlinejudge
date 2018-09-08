fun main(args:Array<String>){
    var num:Int = readLine()!!.toInt()
    var years= num.div(365)
    num =  num.minus(years*365)
    var min = num.div(30)
    num =num.minus(min*30)
    println("$years ano(s)\n$min mes(es)\n$num dia(s)")
}