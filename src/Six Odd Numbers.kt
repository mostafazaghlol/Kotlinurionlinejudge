fun main(args:Array<String>){
    var num:Int = readLine()!!.toInt()
    var count=0
    while (true){
        if(num.rem(2)!=0){
            println(num)
        }
        num++
        count++
        if(count==12){
            break
        }
    }
}