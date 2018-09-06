const val pi:Double  = 3.14159

fun main(Args:Array<String>){
    var area : Double = 0.0
    var Radius:Double = readLine()!!.toDouble()
    area = pi*Radius*Radius
    var areaNeeded = "%.4f".format(area)
    print("A=$areaNeeded")
}
