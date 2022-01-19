package AoC.AoC2020.Dec5

import AoC.AoC2020.makeStringList

//TOdd Ginsburgs solution

fun main(){

    val input = makeStringList ("src/AoC/AoC2020/Dec5/input.txt")

    fun seatId(pattern: String): Int =
        pattern.map { if (it in setOf('B', 'R')) '1' else '0' }.joinToString("").toInt(2)

    fun solvePart2(): Int =
        input.map { seatId(it) }
            .sorted()
            .zipWithNext()
            .first { it.second - it.first != 1 }
            .first + 1


    println(solvePart2())

}
