fun main(args:Array<String>){
    var num:Int = readLine()!!.toInt()
    for(i in 1..num){
        if(i.rem(2)!=0){
            println(i)
        }
    }
}