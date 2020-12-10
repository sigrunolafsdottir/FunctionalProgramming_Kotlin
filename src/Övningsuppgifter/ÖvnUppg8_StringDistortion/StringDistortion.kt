package Övningsuppgifter.ÖvnUppg8_StringDistortion


fun main(){

    val toUpperCase: (s : String) -> String = {it.toUpperCase()}

    val removeBlanks: (s : String) -> String = {it.filter{!it.isWhitespace()}}



    fun stringDistort(distort : (String) -> String){
        println("Skriv in en sträng:")
        val s = readLine()!!

        println(distort(s))
    }

    stringDistort(toUpperCase)
    stringDistort(removeBlanks)


}