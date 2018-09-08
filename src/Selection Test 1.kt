fun main(args:Array<String>) {
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toDouble)
    var (A,B,C,D)  = items
    if(B>C  &&  D>A && (C+D) > (A+B) &&  C>0 && D>0 && A.rem(2) <= 0) {
        println("Valores aceitos")
    }else{
        println("Valores nao aceitos")
    }
}
