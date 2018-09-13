fun main(args:Array<String>){
    var High = 0
    var postioin =0
    for(i in 1..100){
        var x:Int= readLine()!!.toInt()
        if(x>High) {
            High = x
            postioin = i
        }
    }
    println(High)
    println(postioin)
}