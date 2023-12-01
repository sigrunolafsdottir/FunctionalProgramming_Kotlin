package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main(){

    fun writeBackwards(ch :List<Char>) {
        if (ch.size == 0) return
        writeBackwards (ch.takeLast(ch.count() -1))
        println(ch.first())
    }

    // 1.  ['h', 'e', 'j']
    // 2.  [ 'e', 'j']
    // 3.  [ 'j']
    // 4.  [ ]
    //print : j e h

    fun writeBackwardsString(s :String)  {
        if (s.isEmpty()) return
        writeBackwardsString (s.takeLast(s.length -1))
        println(s.first())
    }

    fun writeBackwardsString2(s :String) : String {
        if (s.isEmpty()) return ""
        return writeBackwardsString2 (s.takeLast(s.length -1)) + s.first()
    }
    //sigrun
    //igrun
    //grun

    fun writeBackwardsString3(s :String, i : Int) : String {
        if (i == 0) return ""
        return writeBackwardsString3 (s, i-1) + s[s.length-i]
    }

    fun writeBackwardsString4(s :String, i : Int) : String {
        if (i == s.length) return ""
        return writeBackwardsString4 (s, i+1) + s[i]
    }


    writeBackwards(listOf('h','e','l','l','o'))
    writeBackwardsString("sigrun")
    println(writeBackwardsString2("sigrun"))
    println(writeBackwardsString3("sigrun", "sigrun".length))
    println(writeBackwardsString4("sigrun", 0))

}