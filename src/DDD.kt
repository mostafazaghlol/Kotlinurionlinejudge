fun main(args:Array<String>){
    val num:Int = readLine()!!.toInt()
    println(when(num){
        61 -> "Brasilia"
        71 -> "Salvador"
        11 -> "Sao Paulo"
        21 -> "Rio de Janeiro"
        32 -> "Juiz de Fora"
        19 -> "Campinas"
        27 -> "Vitoria"
        31 -> "Belo Horizonte"
        else -> "DDD nao cadastrado"
    })
}