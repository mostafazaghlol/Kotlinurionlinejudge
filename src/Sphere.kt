import kotlin.math.pow

fun main(args:Array<String>) = print("VOLUME = ${"%.3f".format(readLine()!!.toDouble().pow(3).times(4.0/3.0).times(3.14159))}")