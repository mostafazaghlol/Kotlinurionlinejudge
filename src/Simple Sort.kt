fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toInt)
    var itemsX = items
    items = items.sorted()
    for(x in items){
        println(x)
    }
    println()
    for(x in itemsX) {
        println(x)
    }
}