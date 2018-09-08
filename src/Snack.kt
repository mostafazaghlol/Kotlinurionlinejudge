fun main(args:Array<String>){
    var prices = listOf(4.0,4.5,5.0,2.0,1.5)
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toInt)
    var (num1,num2)  = items
    println("Total: R\$ ${"%.2f".format(prices.get(num1-1).times(num2))}")
}