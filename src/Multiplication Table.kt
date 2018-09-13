fun main(args:Array<String>){
    var number:Int = readLine()!!.toInt()
    for(i in 1..10){
        println("$i x $number = ${i*number}")
    }
}