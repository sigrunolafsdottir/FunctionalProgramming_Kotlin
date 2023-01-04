package AoC.AoC2022.Dec8


import java.io.File


class Dec8(data: List<String>) {

    val input = data

    fun solA() = 0
    fun solB() = 0

}

fun main(){
    val data: List<String> = File("src/AoC/AoC2022/Dec8/input.txt").readLines()
    println("Solution A: "+ Dec8(data).solA())
    println("Solution B: "+ Dec8(data).solB())

}