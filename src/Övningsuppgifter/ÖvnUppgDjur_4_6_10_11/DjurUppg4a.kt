package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11


class Djur (val antalBen: Int, val sort: String){

    fun printAntalBen(){
        println(antalBen)
    }

    fun printSort(){
        println(sort)
    }

    fun printEverything(){
        println("Jag är en $sort med $antalBen ben.")
    }
}

fun main (){}