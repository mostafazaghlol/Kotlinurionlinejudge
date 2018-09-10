fun main(args:Array<String>){
    var fName = readLine()!!.toString()
    var sName = readLine()!!.toString()
    var tName = readLine()!!.toString()
    var result:String=""
    result = when(fName){
        "vertebrado" -> {
            when(sName){
                "mamifero" ->{
                    when(tName){
                        "onivoro" ->{
                            "homem"
                        }
                        "herbivoro" ->{
                            "vaca"
                        }
                        else ->{""}
                    }
                }
                "ave" ->{
                    when(tName){
                        "carnivoro" ->{
                            "aguia"
                        }
                        "onivoro" ->{
                            "pomba"
                        }
                        else ->{""}
                    }
                }
                else -> {
                    ""
                }
            }
        }
        "invertebrado" ->{
            when(sName){
                "inseto" ->{
                    when(tName){
                        "hematofago" ->{
                            "pulga"
                        }
                        "herbivoro" ->{
                            "lagarta"
                        }
                        else ->{""}
                    }
                }
                "anelideo" ->{
                    when(tName){
                        "hematofago" ->{
                            "sanguessuga"
                        }
                        "onivoro" ->{
                            "minhoca"
                        }
                        else ->{""}
                    }
                }
                else -> {
                    ""
                }
            }
        }
        else -> {
            ""
        }
    }
    println(result)
}