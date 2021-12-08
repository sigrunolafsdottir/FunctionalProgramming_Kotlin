package AoC.AoC2020.Dec10

import java.io.File
/*
fun main(){


    val input2: List<Long> = File("src/AoC/Dec10/input.txt")
        .readLines().map{it.toLong()}


    fun createDinstanceMap() : List<Long> {
        val list2 : MutableList<Long> = input2.toMutableList()
        list2.add(0,0)
        list2.add(list2.size, list2.max()!!+3)
        list2.sort()
        return list2.zipWithNext { a, b -> b - a }
    }
*/
/*
    Vid följande tillfällen finns det flera variationer
    3, 1, 1, 3 -> 3, 2, 3  ex:  7, 10, 11, 12, 15 -> 7, 10, 12, 15  => 2 ettor, 2 varianter
    3, 1, 1, 1, 3 ->  3 (2,1), (1,2) ex:  1, 4, 5, 6, 7, 10 -> 1, 4, 7, 10 eller
        1, 4, 5, 6, 7, 10 -> 1, 4, 5, 7, 10 eller 1, 4, 5, 6, 7, 10 -> 1, 4, 6, 7, 10 => 3 ettor, 4 varianter
    3,1,1,1,1,3 -> 3,2,2,3 eller 3,1,3,3 eller 3,3,1,3 eller 3,1,2,1,3 el 3,2,1,1,3 el 3,1,1,2,3
        => 4 ettor, sju varianter

    Vi behöver multiplicera med 2 när vi hittar 2 1:or i rad, med 4 när vi hittar 3 1:or i rad
    och med 7 när vi hittar 4 1<.or i rad

 */
/*
    fun calculatePermutations(distanceMap : List<Long>): Long{
        var onesInARow = 0
        var prod : Long = 1
        for (i in 0..distanceMap.size-1){
            when{
                (distanceMap.get(i) == 1.toLong()) -> {
                    onesInARow++
                }
                (distanceMap.get(i) == 3.toLong()) -> {
                    println("found 3 $onesInARow")
                    when (onesInARow){
                        1 -> prod = prod * 1
                        2 -> prod = prod * 2
                        3 -> prod = prod * 4
                        4 -> prod = prod * 7
                    }
                    onesInARow = 0
                }
            }
        }
        return prod
    }

    println(createDinstanceMap())
    println(calculatePermutations(createDinstanceMap()))


}

 */