package AoC.Dec5

import AoC.makeStringList

fun main(){

    val input = makeStringList ("src/AoC/Dec5/input.txt")

    fun createBinaryString(input : String) :String =
        input.map{if (it.equals('B') || it.equals('R')) 1 else 0}.joinToString("")

    val highestId = input.map { createBinaryString(it).toInt(2) }.sortedDescending().first()

    println(highestId)


}