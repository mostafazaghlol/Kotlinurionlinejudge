fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
    var (A,B) = items
    when {
        A>B -> {
            println("O JOGO DUROU ${
            (24 - A )+B
            } HORA(S)")
        }
        A==B -> println("O JOGO DUROU 24 HORA(S)")
        else -> {
            println("O JOGO DUROU ${
            B-A
            } HORA(S)")
        }
    }
}