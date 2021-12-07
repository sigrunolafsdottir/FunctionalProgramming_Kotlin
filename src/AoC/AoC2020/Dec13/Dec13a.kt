package AoC.AoC2020.Dec13

import java.io.File

fun main(){

    fun isInteger(str: String?) = str?.toIntOrNull()?.let { true } ?: false

    val input: List<String> = File("src/AoC/Dec13/input.txt").readLines()
    val timestamp = input.first().toInt()
    val buslist = input.get(1).split(",").filter{isInteger(it)}.map{it.toInt()}


    fun calc(){
        var (lowestWait, busId) = Pair(Int.MAX_VALUE, 0)
        for (nr in buslist){
            val baseDivider = timestamp / nr
            val waitForCurrentBus : Int = (baseDivider +1) * nr - timestamp
            if( waitForCurrentBus < lowestWait) {
                lowestWait = waitForCurrentBus
                busId = nr
            }
        }

        println("$lowestWait $busId ${lowestWait*busId}")
    }

    calc()


}