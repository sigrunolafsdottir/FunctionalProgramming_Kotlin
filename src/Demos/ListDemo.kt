package Demos


fun main() {


    var ints = listOf(1, 2, 3)
    println( ints )

    //VI kan inte adda till en lista som inte är mutable
   // ints.add(6)
    //  ints.set(1,0) //vi kan inte ändra ett värde, trots att listan är var

    for (e in ints) {
        print("$e ")
        print(e)
    }
    println(" ")

      //om vi inte stoppar in värden i listOf måste vi ange typ
    val list2 : MutableList<String> = mutableListOf()

      //om vi ska kunna ändra i listan måste vi använda me mutable List
    val mutableInts = mutableListOf(3,5,7,8,9)  // 7, 8
    mutableInts.add(7)
    mutableInts += 8    //funkar som add
    mutableInts.set(0, 1)


      //elementen i en lista kan pekas ut som i en java-array med []
      for (e in 0..mutableInts.size-1) {
          print(mutableInts[e])
          print(mutableInts.get(e))
      }
    println(" ")

      //massa olika metoder för listor
      println(ints.takeLast(2))
      println(ints.first())
      println(ints.reversed())
      println(ints.lastIndexOf(5))
      println(ints.lastIndexOf(2))
      println()

      println(ints.joinToString(" aa ", prefix=" bb ", postfix=" cc ") {"[${it+2}]"} )
      println(ints.joinToString(" aa ", transform = {"[${it-2}]"}) )
      println()

      println( ints.mapIndexed { index, _ -> "[$index]"})
      println( ints.mapIndexed { index, i -> "$index - $i "})

    //--------------------------------





}