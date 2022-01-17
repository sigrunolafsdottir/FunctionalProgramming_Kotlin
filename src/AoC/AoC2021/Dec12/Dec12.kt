package AoC.AoC2021.Dec12

import AoC.AoC2020.createMatrix
import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList


class Dec12(data: List<String>) {

    val input = data

    fun solA(): Int {

        return 1
    }

    fun solB(): Int = 1

}

    fun main(){
        val data: List<String> = makeStringList("src/AoC/AoC2021/Dec12/input.txt")
        println("Solution A: "+Dec12(data).solA())
        println("Solution B: "+Dec12(data).solB())
    }
