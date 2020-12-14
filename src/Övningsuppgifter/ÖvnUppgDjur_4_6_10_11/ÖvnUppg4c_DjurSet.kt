package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11

fun main() {
    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")

    //val list = listOf(katt, hund, spindel)

    val set1 = setOf(spindel, katt, katt, katt, hund, spindel)
    val set2 = setOf( katt, hund, spindel)
    val set3 = setOf( katt, spindel)

    set1.forEach({e -> e.printEverything()})
    println(set1.equals(set2))
    println(set1.equals(set3))
}