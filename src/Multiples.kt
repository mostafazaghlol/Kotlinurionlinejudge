fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
    var (num1,num2) = items
    if(num2.rem(num1) == 0 || num1.rem(num2) == 0){
        println("Sao Multiplos")
    }else{
        println("Nao sao Multiplos")
    }
}