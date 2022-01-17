package AoC.AoC2021.Dec1

import AoC.AoC2020.makeIntList

//hittad på nätet

class Dec1Windowed(data: List<Int>) {

    val input = data

    fun solA() = input.windowed(2).filter{it.elementAt(0) < it.elementAt(1)}.count()

    fun solB() = input.windowed(3).map{it.sum()}.windowed(2).count{it[0] < it[1]}
}


fun main(){
    val data: List<Int> = makeIntList("src/AoC/AoC2021/Dec1/input.txt")
    println("Solution A: "+Dec1Windowed(data).solA())
    println("Solution B: "+Dec1Windowed(data).solB())
}


