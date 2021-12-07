package AoC.AoC2021.Dec8

import AoC.AoC2020.createMatrix
import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList


class Dec8(data: List<Int>) {



    fun solA(): Int = 1
    fun solB(): Int = 1
}


    fun main(){
        val data: List<Int> = makeIntListFromOneString("src/AoC/AoC2021/Dec8/input.txt")
        println("Solution A: "+Dec8(data).solA())
        println("Solution B: "+Dec8(data).solB())
    }
