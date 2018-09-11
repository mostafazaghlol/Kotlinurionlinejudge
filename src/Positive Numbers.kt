fun main(args:Array<String>){
    var num:Short = 0
    var x=0.0
    for(i in 1..6){
        x= readLine()!!.toDouble()
        if(x>0.0){
            num++
        }
    }
    println("$num valores positivos")
}