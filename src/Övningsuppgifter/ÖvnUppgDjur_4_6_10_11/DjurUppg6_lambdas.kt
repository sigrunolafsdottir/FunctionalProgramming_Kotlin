package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11


fun main(){
    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")

    var list = mutableListOf(katt, hund, spindel)

    /*
//6a. olika alternativ för att skriva ut listan
    for (d in list){
        d.printEverything()
    }

       //6a. alternativ for-loop
       list.forEach{e -> e.printEverything()}
       println()

       list.forEach{it.printEverything()}
       println()

       list.forEach({println(it.sort +" "+it.antalBen)})

       list.forEach{println(it.sort +" "+it.antalBen)}

       //6b. gör om alla djur till grodor

       fun createFrogs(l: MutableList<Djur> ) : MutableList<Djur>{
           return l.map{Djur(4, "groda") }.toMutableList()
       }

    //list = createFrogs(list)

       createFrogs(list).forEach{it.printEverything()}

        list.forEach{println(it.sort +" "+it.antalBen)}

       var frogmaker = list.map { Djur(4,"groda") }
       frogmaker.forEach{it.printEverything()}



    //Minilab joinToString
    println(list.joinToString(" aa ") {"[${it.sort.toUpperCase()}]"} )
    println(list.joinToString(" aa ", transform = {"[${it.sort.toUpperCase()}]"}) )


    //Minilab mapIndexed där man inte bryr sig om alla parametrar
    println( list.mapIndexed { index, _ -> "[$index]"})
    println( list.mapIndexed { index, d -> "$index. ${d.sort}"})


*/

              //6c. ta bort spindlarna, 2 variationer



              fun removeSpiders(list: List<Djur> ) : List<Djur>{
                  return list.filter{!it.sort.equals("spindel")}
              }
              removeSpiders(list).forEach{ it.printEverything()}

              var spindelfilter = list.filterNot{it.sort.equals("spindel")}
              spindelfilter.forEach{it.printEverything()}



              //6d. kolla om det finns några katter
              var kollaKatter = list.any{it.sort.equals("katt")}
              println(kollaKatter)

/*
              //6e, högst antal ben
              var numberOfLegs = list.map{it.antalBen }.max()
              println(numberOfLegs)

              //6f, summan av antal ben
              var sumOfLegs = list.map{it.antalBen }.sum()
              println(sumOfLegs)

              //6g, antal insekter i listan
              var countInsects = list.filter{it.antalBen > 4}.count()
              println(countInsects)

              //6h, fördubblar antal djur i listan
              var doubleUp = list + list
              doubleUp.forEach{it.printEverything()}
*/
}