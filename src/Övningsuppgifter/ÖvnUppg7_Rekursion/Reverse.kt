package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main(){

    fun writeBackwards(ch :List<Char>) : Unit  {
        if (ch.size == 0) return
        writeBackwards (ch.takeLast(ch.count() -1))
        println(ch.first())
    }

    fun writeBackwardsString(s :String)  {
        if (s.isEmpty()) return
        writeBackwardsString (s.takeLast(s.length -1))
        println(s.first())
    }

    fun writeBackwardsString2(s :String) : String {
        if (s.isEmpty()) return ""
        return writeBackwardsString2 (s.takeLast(s.length -1)) + s.first()
    }


    writeBackwards(listOf('h','e','l','l','o'))
    writeBackwardsString("sigrun")
    println(writeBackwardsString2("sigrun"))

}