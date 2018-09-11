fun main(args:Array<String>){
    var num=0

    for (i in 1..5) {
        var x = readLine()!!.toDouble()
        if (x.rem(2.0) == 0.0) {
            num++
        }
    }
    println("$num valores pares")
}