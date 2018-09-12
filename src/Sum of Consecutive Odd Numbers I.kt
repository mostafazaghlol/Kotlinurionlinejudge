fun main(args:Array<String>){
    var num1:Int = readLine()!!.toInt()
    var num2:Int = readLine()!!.toInt()
    var s=0
    if(num1>num2){
        s=num1
        num1 =num2
        num2=s
    }
    s=0
    for(i in (num1+1)..(num2-1) step 1){
        if(i.rem(2)!=0){
            s+=i
        }
    }
    println(s)
}