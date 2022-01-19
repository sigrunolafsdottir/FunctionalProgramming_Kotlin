package AoC.AoC2021.Dec1

import AoC.AoC2020.makeIntList

//hittad på nätet

class Dec1Windowed(data: List<Int>) {

    val input = data

    fun solA() = input.windowed(2).filter{it.elementAt(0) < it.elementAt(1)}.count()

    fun solB() = input.windowed(3).map{it.sum()}.windowed(2).count{it[0] < it[1]}

    //Todd Ginsburgs lösningar, använder zipWithNext
    fun solA2(): Int = input.zipWithNext().count { it.first < it.second }

    fun solB2(): Int = input
        .windowed(3, 1) { it.sum() }
        .zipWithNext()
        .count { it.first < it.second }
}


fun main(){
    val data: List<Int> = makeIntList("src/AoC/AoC2021/Dec1/input.txt")
    println("Solution A: "+Dec1Windowed(data).solA())
    println("Solution B: "+Dec1Windowed(data).solB())
    println()
    println("Solution A: "+Dec1Windowed(data).solA2())
    println("Solution B: "+Dec1Windowed(data).solB2())
}


