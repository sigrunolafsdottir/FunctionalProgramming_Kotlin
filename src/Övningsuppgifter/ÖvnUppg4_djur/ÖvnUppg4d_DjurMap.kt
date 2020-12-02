package Övningsuppgifter.ÖvnUppg4_djur


fun main() {
    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")

    //val list = listOf(katt, hund, spindel)

    val map1 = mapOf("Tusse" to katt, "Fido" to hund, "Robert" to spindel)

    for ((key, value) in map1)      // [3]
        println("$key=${value.sort}")
}