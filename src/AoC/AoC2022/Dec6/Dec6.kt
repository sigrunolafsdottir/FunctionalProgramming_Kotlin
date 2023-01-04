package AoC.AoC2022.Dec6

import java.io.File


class Dec6(data: String) {

    val input = data

    fun sol(w : Int) = input.windowed(w).map{it.toSet()}.indexOfFirst { it.size == w } + w

}

fun main(){
    val data: String = File("src/AoC/AoC2022/Dec6/input.txt").readLines().first()
    println("Solution A: "+ Dec6(data).sol(4))
    println("Solution B: "+ Dec6(data).sol(14))

}