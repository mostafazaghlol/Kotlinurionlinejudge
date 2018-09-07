fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toDouble)
    var (num1,num2)  = items
    items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toDouble)
    var (num3,num4) = items
    var x:Double= num3 - num1
    var y = num4 - num2
    x=Math.pow(x,2.0)
    y=Math.pow(y,2.0)
    var z = x+y
    z=Math.pow(z,0.5)
    println("%.4f".format(z))

}