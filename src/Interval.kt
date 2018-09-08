fun main(args:Array<String>){
    var num : Double  = readLine()!!.toDouble()
    when(num){
        in 0.toDouble()..25.toDouble() -> println("Intervalo [0,25]")
        in 25.toDouble()..50.toDouble() -> println("Intervalo (25,50]")
        in 50.toDouble()..75.toDouble() -> println("Intervalo (50,75]")
        in 75.toDouble()..100.toDouble() -> println("Intervalo (75,100]")
        else-> println("Fora de intervalo")
    }
}