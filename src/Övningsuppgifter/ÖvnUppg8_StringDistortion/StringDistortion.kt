package Övningsuppgifter.ÖvnUppg8_StringDistortion


fun main(){

    val toUpperCase: (s : String) -> String = {it.toUpperCase()}

    val toLowerCase = {s:String -> s.toLowerCase()}

    val removeBlanks: (s : String) -> String = {it.filterNot{it.isWhitespace()}}


    fun stringDistort(distort : (String) -> String){
        println("Skriv in en sträng:")
        val s = readLine()!!

        println(distort(s))
    }

    stringDistort(toUpperCase)
    stringDistort(toLowerCase)

    //exempel på lambda direkt, utan parameter
    stringDistort({it.toLowerCase()})

    stringDistort(removeBlanks)


}