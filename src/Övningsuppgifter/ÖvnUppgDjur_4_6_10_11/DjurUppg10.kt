package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11

fun main(){

    //Uppgift 10a
    val minaDjur = listOf("Myra", "Katt", "Spindel", "Människa")
    val antalBen = listOf(6, 4, 8, 2)

    val allaDjur: List<Djur> = minaDjur.zip(antalBen) { sort, antalBen ->
        Djur(antalBen, sort) }

    allaDjur.forEach{it.printEverything()}

    //Uppgift 10b

    val intList = listOf(2, 3, 8, 45, 123, 256, 2345)
    val distance = intList.zipWithNext{a,b -> b-a}
    println(distance)




}