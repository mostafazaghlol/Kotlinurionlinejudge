fun main(Args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toDouble)
    var (Fnum,Snum)  = items
    if(Fnum >0 && Snum >0){
        println("Q1")
    }else if(Fnum<0 &&Snum>0){
        println("Q2")
    }else if(Fnum <0 && Snum<0){
        println("Q3")
    }else if(Fnum >0 && Snum<0){
        println("Q4")
    }else if(Fnum == 0.0 && Snum != 0.0){
        println("Eixo Y")
    }else if(Fnum != 0.0 && Snum == 0.0){
        println("Eixo X")
    }else{
        println("Origem")
    }
}