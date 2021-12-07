package AoC.AoC2020.Dec3

import AoC.AoC2020.makeStringList


fun main(){

    data class Pair (val deltaX : Int, val deltaY: Int)

    val input = makeStringList ("src/AoC/Dec3/input.txt")

    val slopes : List<Pair> = listOf(Pair(1,1), Pair(3,1),
        Pair(5,1), Pair(7,1), Pair(1,2))

    fun countTrees(coords : Pair) : Int {
        var counter : Int = 0
        var x : Int = 0
        val width : Int = input.get(0).length
        val rowNum : Int = input.size -1
        for (y in 0..rowNum-coords.deltaY step coords.deltaY) {     //iter row
            x = (x + coords.deltaX) % width
            if (input.get(y+coords.deltaY).get(x) == '#') counter++
        }
        return counter
    }


    println(slopes.map{countTrees(it).toLong()}.reduce { acc, e -> e*acc })


}