package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11


fun main() {
    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")
    var katt2 = Djur(4, "katt")



    val map1 = mapOf("Tusse" to katt, "Fido" to hund, "Robert" to spindel)

    val map2 = mapOf("katt" to listOf(katt, katt2), "hund" to hund, "spindel" to spindel)

    for ((key, value) in map1)      // [3]
        println("$key=${value.sort}")

    println()

    for ((key, value) in map2)      // [3]
        println("$key=$value.")

    map1.forEach{e -> println("${e.key} - ${e.value}")}
}