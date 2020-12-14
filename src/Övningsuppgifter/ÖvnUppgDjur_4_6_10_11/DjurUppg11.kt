package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11


fun main(){
    var bettan = Djur(4, "katt")
    var sune = Djur(4, "katt")
    var doris = Djur(4, "katt")
    var bella = Djur(4, "ko")
    var mika = Djur(4, "hund")
    var bosse = Djur(8, "spindel")

    val list = listOf(bettan, sune, doris, mika, bosse, bella)

    // 11a
    //skapar en map med Djur.sort som nyckel och en lista av Djur som values
    val mapA: Map<String, List<Djur>> =  list.groupBy(Djur::sort)

    for ((key, value) in mapA) {
        println("$key = ${value.size}")
    }

    println()

    //11b
    //skapar en map med Djur.antal ben som nyckel och en lista av Djur som values
    val mapB: Map<Int, List<Djur>> =  list.groupBy(Djur::antalBen)

    for ((key, value) in mapB) {
        println("$key = ${value.map{it.sort}.distinct()}")
    }

    println()

    //11c filtrering av Map

    val mapFilter1: Map<String, List<Djur>> =
        mapA.filterKeys { it.startsWith("k") }

    for ((key, value) in mapFilter1) {
        println("$key = ${value.size}")
    }

    println()

    val mapFilter2: Map<String, List<Djur>> =
        mapA.filterValues { it.size == 1}

    for ((key, value) in mapFilter2) {
        println("$key = ${value.map{it.sort}.distinct()}")
    }

    println()

    //11d

    println(mapA.any { (key, _) -> key.equals("katt") })
    println(mapA.all { (key, _) -> key.equals("katt") })


    //11e

    println(list.fold(0) { sum, n -> sum + n.antalBen })

}