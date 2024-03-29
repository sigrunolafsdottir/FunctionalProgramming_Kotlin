package Övningsuppgifter.ÖvnUppgDjur_4_6_10_11

import java.util.*


fun main(){
    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")

    var list = listOf(katt, hund, spindel)


    //6a. alternativ for-loop
    list.forEach{e -> e.printEverything()}
    println()

    list.forEach{it.printEverything()}
    println()

    list.forEach({println(it.sort +" "+it.antalBen)})


    //6b. gör om alla djur till grodor
    //både genom att använda fun och var

    fun createFrogs(l: List<Djur> ) : List<Djur>{
        return l.map{Djur(4, "groda") }
    }

    createFrogs(list).forEach{it.printEverything()}
    println(" ")

    var frogmaker = list.map { Djur(4,"groda") }
    frogmaker.forEach{it.printEverything()}
    println(" ")


    //Nedanstående skriver om list så att alla djuren blir grodor
    //notera att detta ändrar inne i elementen i orginallistan
    //var frogmaker2  = list.map { it.sort = "groda" }
 //   list.forEach{it.printEverything()}  //bara grodor, olika benantal


        //Minilab joinToString
    println(list.joinToString(" aa ") {"[${it.sort.uppercase()}]"} )
    println(list.joinToString(" aa ", transform = {"[${it.sort.uppercase()}]"}) )


            //Minilab mapIndexed där man inte bryr sig om alla parametrar
    println( list.mapIndexed { index, _ -> "[$index]"})
    println( list.mapIndexed { index, d -> "$index. ${d.sort}"})


          //6c. ta bort spindlarna, 2 variationer

          fun removeSpiders(list: List<Djur> ) : List<Djur>{
              return list.filter{!it.sort.equals("spindel")}
          }

          removeSpiders(list).forEach{ it.printEverything()}
          println(" ")

          var spindelfilter = list.filterNot{it.sort.equals("spindel")}
          spindelfilter.forEach{it.printEverything()}
          println(" ")




                  //6d. kolla om det finns några katter
                  var kollaKatter = list.any{it.sort.equals("katt")}
                  println(kollaKatter)


                  var emptyList : List<Int> = listOf()
    /*
                  //6e, högst antal ben
                  var numberOfLegs = list.map{it.antalBen }.maxOrNull()
                  var numberOfLegs2 = list.maxOf{it.antalBen}
                  var numberOfLegs3 = list.maxOfOrNull{it.antalBen}

                  val maxLegsInt = {l: List<Djur> -> l.maxOf{ it.antalBen }}

                  fun maxLegsIntFun(l: List<Djur> ) :Int{
                      return l.maxOf{ it.antalBen }
                  }

                  fun maxLegsIntFun2(l: List<Djur> ) :Int = l.maxOf{ it.antalBen }


                  println(maxLegsInt(list))


                  println(numberOfLegs)
                  println(numberOfLegs2)
                  println(numberOfLegs3)
                  println(emptyList.maxOrNull())

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