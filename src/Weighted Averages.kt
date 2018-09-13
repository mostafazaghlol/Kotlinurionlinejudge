fun main(args:Array<String>){
    val numOfTime:Int = readLine()!!.toInt()
    for(i in 1..numOfTime){
        var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toDouble)
        var (num1,num2,num3)  = items
        var average = ((num1*2)+(num2*3)+(num3*5)).div(10)
        println("%.1f".format(average))
    }

}