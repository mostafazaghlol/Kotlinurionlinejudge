fun main(args:Array<String>){
    var N:Int = readLine()!!.toInt()
    for(i in 1..N){
        if(i.rem(2)==0) println("$i^2 = ${Math.pow(i.toDouble(),2.0).toInt()}")
    }
}