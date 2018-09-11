fun main(args:Array<String>){
    var num:Short = 0
    var x=0.0
    var sum:Double=0.0
    for(i in 1..6){
        x= readLine()!!.toDouble()
        if(x>0.0){
            num++
            sum+=x
        }
    }
    println("$num valores positivos")
    println("${"%.1f".format(sum/num.toDouble())}")
}