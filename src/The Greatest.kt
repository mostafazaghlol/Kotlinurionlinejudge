fun main(args:Array<String>) {
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toInt)
    var (num1,num2,num3)  = items
    var theGreatest = Math.max(Math.max(num1,num2),num3)
    println("$theGreatest eh o maior")
}