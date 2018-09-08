fun main(Args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map (String::toDouble)
    var (Fnum,Snum,Tnum,Fonum)  = items
    var Average =  ((Fnum*2)+(Snum*3)+(Tnum*4)+(Fonum*1)).div(10).minus(0.01)
    var AverageNeeded = "%.1f".format(Average)
    println("Media: $AverageNeeded")
    if(AverageNeeded.toDouble() >= 7.0){
        println("Aluno aprovado.")
    }else if(AverageNeeded.toDouble() < 5.0){
        println("Aluno reprovado.")
    }else{
        println("Aluno em exame.")
        var score:Double = readLine()!!.toDouble()
        println("Nota do exame: $score")
        score += AverageNeeded.toDouble()
        score /=2
        if(score > 5){
            println("Aluno aprovado.")
        }else{
            println("Aluno reprovado.")
        }
        println("Media final: $score")
    }
}