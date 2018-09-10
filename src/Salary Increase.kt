fun main(args:Array<String>){
    val num:Double = readLine()!!.toDouble()
    var salary:Double =0.0
    var salaryAdd:Double =0.0
    when (num) {
        in 0.00..400.00 -> {
            salaryAdd=num.times(0.15)
            salary+=num.plus(num.times(0.15))
            println("Novo salario: ${"%.2f".format(salary)}\nReajuste ganho: ${"%.2f".format(salaryAdd)}\nEm percentual: 15 %")
        }
        in 400.00..800.00 -> {
            salaryAdd=num.times(0.12)
            salary+=num.plus(num.times(0.12))
            println("Novo salario: ${"%.2f".format(salary)}\nReajuste ganho: ${"%.2f".format(salaryAdd)}\nEm percentual: 12 %")}
        in 800.00..1200.00 -> {
            salaryAdd=num.times(0.10)
            salary+=num.plus(num.times(0.10))
            println("Novo salario: ${"%.2f".format(salary)}\nReajuste ganho: ${"%.2f".format(salaryAdd)}\nEm percentual: 10 %")
        }
        in 1200.00..2000.00 -> {
            salaryAdd=num.times(0.07)
            salary+=num.plus(num.times(0.07))
            println("Novo salario: ${"%.2f".format(salary)}\nReajuste ganho: ${"%.2f".format(salaryAdd)}\nEm percentual: 7 %")
        }
        else -> {
            salaryAdd=num.times(0.04)
            salary+=num.plus(num.times(0.04))
            println("Novo salario: ${"%.2f".format(salary)}\nReajuste ganho: ${"%.2f".format(salaryAdd)}\nEm percentual: 4 %")
        }
    }
    /*
Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %
     */


}