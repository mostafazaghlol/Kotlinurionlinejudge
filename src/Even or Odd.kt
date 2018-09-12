fun main(args:Array<String>){
    var num:Int = readLine()!!.toInt()
    for(i in 1..num){
        var x = readLine()!!.toInt()
        if(x==0) {
            println("NULL")
            continue
        }
        if(x>0){
            if(x.rem(2) == 0){
                println("EVEN POSITIVE")
                continue
            }else{
                println("ODD POSITIVE")
                continue
            }
        }else{
            if(x.rem(2) == 0){
                println("EVEN NEGATIVE")
                continue
            }else{
                println("ODD NEGATIVE")
                continue
            }
        }
    }
}