fun main(args:Array<String>){
    var num=0
    var num2=0
    var pos=0
    var neg=0
    for (i in 1..5) {
        var x = readLine()!!.toDouble()
        if(x == 0.0){
            num++
            continue
        }
        if (x.rem(2.0) == 0.0) {
            num++
        }else {
            num2++
        }
        if(x>0){
            pos++
        }else{
            neg++
        }

    }
    println("$num valor(es) par(es)")
    println("$num2 valor(es) impar(es)")
    println("$pos valor(es) positivo(s)")
    println("$neg valor(es) negativo(s)")
}