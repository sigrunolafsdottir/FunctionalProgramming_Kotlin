package AoC.Dec3

import AoC.makeStringList


fun main(){

    val input = makeStringList ("src/AoC/Dec3/input.txt")

    var x : Int = 0
    var counter : Int = 0
    val width : Int = input.first().length
    val rowNum : Int = input.size -1

    for(y in 1..rowNum){    //iter row
        x = (x+3) % width
        if (input.get(y).get(x) == '#') counter++
    }

    println(counter)

}