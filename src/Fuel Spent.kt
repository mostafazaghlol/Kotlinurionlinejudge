fun main(args:Array<String>) {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var ful:Double = (num1* num2) /12.0
    println("%.3f".format(ful))
}