fun main(args:Array<String>){
    var number:Int = readLine()!!.toInt()
    for (i in  1..10000){
        if(i.rem(number) == 2){
            println(i)
        }
    }
}