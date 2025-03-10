package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11


class Djur2 (val sort : String = "Katt", val antalBen : Int = 4){
    fun printAll() = println("Sort: $sort Antal Ben: $antalBen")



}

fun main(){

    val d1 = Djur2()
    val d2 = Djur2("Hund", 2)
    val d3 = Djur2("Spindel", 8)

    val djurLista = listOf(d1, d2, d3)

    for(d in djurLista){
        d.printAll()
    }
}