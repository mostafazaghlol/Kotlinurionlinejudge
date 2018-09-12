fun main(args:Array<String>){
    var num:Int = readLine()!!.toInt()
    var In:Int= 0
    var Out:Int= 0

    for(i in 1..num){
        var x:Int = readLine()!!.toInt()
        if (x in 10..20) {
            In++
        } else {
            Out++
        }
    }
    println("$In in")
    println("$Out out")
}