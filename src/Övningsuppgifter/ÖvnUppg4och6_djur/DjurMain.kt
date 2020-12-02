package Övningsuppgifter.ÖvnUppg4och6_djur


fun main(){
    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")

    val list = listOf(katt, hund, spindel)
/*
//6a. olika alternativ för att skriva ut listan
    for (d in list){
        d.printEverything()
    }
 */
/*
       //6a. alternativ for-loop
       list.forEach{e -> e.printEverything()}
       println()

       list.forEach{it.printEverything()}
       println()


       list.forEach({println(it.sort +" "+it.antalBen)})

       //6b. gör om alla djur till grodor

       fun createFrogs(list: List<Djur> ) : List<Djur>{
           return list.map({Djur(4, "groda") })
       }
       println(createFrogs(list).forEach({e -> e.printEverything()}))

       var frogmaker = list.map { Djur(4,"groda") }
       println(frogmaker.forEach({e -> e.printEverything()}))



    //Minilab joinToString
    println(list.joinToString(" aa ") {"[${it.sort.toUpperCase()}]"} )
    println(list.joinToString(" aa ", transform = {"[${it.sort.toUpperCase()}]"}) )


    //Minilab mapIndexed där man inte bryr sig om alla parametrar
    println( list.mapIndexed { index, _ -> "[$index]"})
    println( list.mapIndexed { index, d -> "$index. ${d.sort}"})

    */

        /*
              //6c. ta bort spindlarna, 2 variationer

              fun removeSpiders(list: List<Djur> ) : List<Djur>{
                  return list.filter({e -> !e.sort.equals("spindel")})
              }
              println(removeSpiders(list).forEach({ e -> e.printEverything()}))

              var spindelfilter = list.filter({e -> !e.sort.equals("spindel")})
              println(spindelfilter.forEach({e -> e.printEverything()}))


              //6d. kolla om det finns några katter
              var kollaKatter = list.any({e -> e.sort.equals("katt")})
              println(kollaKatter)


              //6e, högst antal ben
              var numberOfLegs = list.map({e -> e.antalBen }).max()
              println(numberOfLegs)

              //6f, summan av antal ben
              var sumOfLegs = list.map({e -> e.antalBen }).sum()
              println(sumOfLegs)

              //6g, antal insekter i listan
              var countInsects = list.filter({e -> e.antalBen > 4}).count()
              println(countInsects)

              //6h, fördubblar antal djur i listan
              var doubleUp = list + list
              println(doubleUp.forEach({e -> e.printEverything()}))
          */
}