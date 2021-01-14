package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11


fun main(){
    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")

    val list = listOf(katt, hund, spindel)
    val list2 = listOf(hund, katt, spindel)
    val list3 = listOf(hund, katt, spindel)

    println(list.equals(list2))
    println(list3.equals(list2))

}