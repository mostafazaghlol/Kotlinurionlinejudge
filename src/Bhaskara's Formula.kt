

fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toDouble)
    var (A,B,C)  = items
    var I = (-B)/(A*2)
    var ii = Math.pow(B,2.0)-(A*C*4)
    var II = Math.sqrt(ii)/(A*2)
    val R1 = I + II
    val R2 = I - II
    if(A==0.0|| ii<0 ){
        System.out.format("Impossivel calcular%n");
    }else{

        System.out.format("R1 = %.5f%n",R1);
        System.out.format("R2 = %.5f%n",R2);
    }

}