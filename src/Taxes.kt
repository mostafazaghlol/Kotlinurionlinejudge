fun main(args:Array<String>){
    var num:Double = readLine()!!.toDouble()
    when(num){
        in 0.0..2000.0 ->{
            println("Isento")
        }
        in 2000.0..3000.0 ->{
            num -= 2000
            println("R\$ ${"%.2f".format(num*0.08)}")
        }
        in 3000.0..4500.0 ->{
            num -= 3000
            println("R\$ ${"%.2f".format((num*0.18).plus(1000*0.08))}")
        }
        else->{
            num -= 4500
            println("R\$ ${"%.2f".format((num*0.28).plus(80).plus(270))}")
        }

    }
}