fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map(String::toDouble)
    items = items.sortedDescending()
    var (A,B,C) = items
    when {
        A >= (B+C) -> println("NAO FORMA TRIANGULO")
        Math.pow(A,2.0) == Math.pow(B,2.0).plus(Math.pow(C,2.0)) -> println("TRIANGULO RETANGULO")
        Math.pow(A,2.0) > Math.pow(B,2.0).plus(Math.pow(C,2.0)) -> println("TRIANGULO OBTUSANGULO")
        Math.pow(A,2.0) < Math.pow(B,2.0).plus(Math.pow(C,2.0)) -> println("TRIANGULO ACUTANGULO")
    }
    if(A == B&&B == C) println("TRIANGULO EQUILATERO")
    else if((A==B||B==C||A==C))println("TRIANGULO ISOSCELES")

}