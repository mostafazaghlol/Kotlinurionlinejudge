fun main(args:Array<String>){
    var items = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
    var (A,B,C,D) = items
    var h:Int = 0
    var m :Int= 0
    when {
        A>C -> {
            h = (24 - A )+C

            when {
                B>D -> {
                    m=60-(B-D)
                    h--
                }
                B<D -> {
                    m=D-B
                }
                else -> {
                    m=0
                }
            }
            println("O JOGO DUROU $h HORA(S) E $m MINUTO(S)")
        }
        A==C -> {
            when {
                B>D -> {
                    h=23
                    m = 60-(B-D)
                }
                B<D -> {
                    h=0
                    m = D-B
                }
                else -> {
                    h=24
                    m=0
                }
            }
            println("O JOGO DUROU $h HORA(S) E $m MINUTO(S)")
        }else -> {
                h=C-A
       when {
            B>D -> {
                m=60-(B-D)
                if(h>1) {
                    h--
                }else{
                    h=0
                }
            }
            B<D -> {
                m= D-B

            }
            else -> {
                m=0
            }
        }
        println("O JOGO DUROU $h HORA(S) E $m MINUTO(S)")

    }
    }
}