fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map(String::toDouble)
    var (num1,num2,num3) = items
    if((num1+num2)>num3 && (num2+num3)>num1 && (num1+num3)>num2 ){
        println("Perimetro = ${items.sum()}")
    }else{
        println("Area = ${0.5*(num1+num2)*num3}")
    }

}