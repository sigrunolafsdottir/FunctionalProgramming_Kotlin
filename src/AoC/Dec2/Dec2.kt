package AoC.Dec2

import java.io.File

fun main ()  {

    val fileName : String = "src/AoC/Dec2/input.txt"
    val input: List<String> = File(fileName).readLines()
    var counter : Int = 0

    for (i in 0..input.size-1){

        val parts = input.get(i).split(" ", ":", "-")
        val startRange = parts[0].toInt()
        val stopRange = parts[1].toInt()
        val letter = parts[2].trim().single()
        val password = parts[4].toCharArray()

        if (password.filter{ it == letter}.count() in startRange..stopRange) counter++

    }
    println(counter)

}