package AoC.AoC2020.Dec2

import java.io.File

fun main ()  {
//1-14 b: bbbbbbbbbbbbbbbbbbb
    val input: List<String> = File("src/AoC/AoC2020/Dec2/input.txt").readLines()
    var counter = 0

    for (e in input){
        val parts = e.split(" ", ":", "-")
        val startRange = parts[0].toInt()
        val stopRange = parts[1].toInt()
        val letter = parts[2].trim().single()
        val password = parts[4].toCharArray()

        if (password.count{ it == letter} in startRange..stopRange) counter++

    }
    println(counter)

}