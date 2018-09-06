fun main(arg:Array<String>){
    var name:String = readLine()!!.toString()
    var fixedSalary:Double = readLine()!!.toDouble()
    var seles:Double = readLine()!!.toDouble()
    var salary = fixedSalary + (seles.times(0.15))
    var salaryNeed:String = "%.2f".format(salary)
    println("TOTAL = R\$ $salaryNeed")
}