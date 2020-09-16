package Övningsuppgifter


fun main(){
    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")

    val list = listOf(katt, hund, spindel)
/*
    for (d in list){
        d.printEverything()
    }

    //4a. alternativ for-loop
    list.forEach({e -> e.printEverything()})
    println()

    //4b. gör om alla djur till grodor

    fun createFrogs(list: List<Djur> ) : List<Djur>{
        return list.map({Djur(4, "groda") })
    }
    println(createFrogs(list).forEach({e -> e.printEverything()}))

    var frogmaker = list.map { Djur(4,"groda") }
    println(frogmaker.forEach({e -> e.printEverything()}))


    //4c. ta bort spindlarna, 2 variationer

    fun removeSpiders(list: List<Djur> ) : List<Djur>{
        return list.filter({e -> !e.sort.equals("spindel")})
    }
    println(removeSpiders(list).forEach({ e -> e.printEverything()}))

    var spindelfilter = list.filter({e -> !e.sort.equals("spindel")})
    println(spindelfilter.forEach({e -> e.printEverything()}))


    //4d. kolla om det finns några katter
    var kollaKatter = list.any({e -> e.sort.equals("katt")})
    println(kollaKatter)
    */

    //4e, högst antal ben
    var numberOfLegs = list.map({e -> e.antalBen }).max()
    println(numberOfLegs)

    //4f, summan av antal ben
    var sumOfLegs = list.map({e -> e.antalBen }).sum()
    println(sumOfLegs)

    //4g, antal insekter i listan
    var countInsects = list.filter({e -> e.antalBen > 4}).count()
    println(countInsects)

    //4h, fördubblar antal djur i listan
    var doubleUp = list + list
    println(doubleUp.forEach({e -> e.printEverything()}))

}