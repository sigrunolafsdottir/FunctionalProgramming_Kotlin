package Övningsuppgifter.ÖvnUppg8_StringDistortion


fun main(){

    val toUpperCase: (s : String) -> String = {s -> s.uppercase()}
    val toUpperCase2: (s : String) -> String = {it.uppercase()}

    val toLowerCase = {s:String -> s.lowercase()}
    //funkar inte, inparameter typ måste vara angiven på ett eller annat ställe
    //val toLowerCase2 = {it.lowercase()}

    val removeBlanks: (s : String) -> String = {it.filterNot{it.isWhitespace()}}


    fun stringDistort(distort : (String) -> String){
        println("Skriv in en sträng:")
        val s = readLine()!!

        println(distort(s))
    }

    stringDistort(toUpperCase)
    stringDistort(toLowerCase)

    //exempel på lambda direkt, utan parameter
    stringDistort({it.lowercase()})

    stringDistort(removeBlanks)


}