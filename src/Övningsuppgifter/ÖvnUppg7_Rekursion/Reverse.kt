package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main(){

    fun writeBackwards(ch :List<Char>) : Unit  {
        if (ch.size == 0) return
        writeBackwards (ch.takeLast(ch.count() -1))
        println(ch.first())  //not tailrec because of println last
    }

    println(writeBackwards(listOf('h','e','l','l','o')))

}