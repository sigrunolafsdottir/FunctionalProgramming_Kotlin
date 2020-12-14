package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11


class Djur (antalBen: Int, sort: String){
    var antalBen: Int = antalBen
        get() {
            return field
        }
        set(value) {
            field =value
        }
    var sort: String = sort
        get() {
            return field
        }
        set(value) {
            field =value
        }

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