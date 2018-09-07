fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toDouble)
    var (num1,num2,num3)  = items
    val ARect = 0.5 * (num1 * num3)
    val AC = pi * Math.pow(num3, 2.0)
    val AT = 0.5 * (num1 + num2) * num3
    val AS = Math.pow(num2, 2.0)
    val AR = num1 * num2
    System.out.printf("TRIANGULO: %.3f\n", ARect);
    System.out.printf("CIRCULO: %.3f\n", AC);
    System.out.printf("TRAPEZIO: %.3f\n", AT);
    System.out.printf("QUADRADO: %.3f\n", AS);
    System.out.printf("RETANGULO: %.3f\n", AR);
}