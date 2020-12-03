package AoC.Dec2

import java.io.File

var counter : Int = 0

fun main ()  {

    val fileName : String = "src/AoC/Dec2/input.txt"
    val input: List<String> = File(fileName).readLines()

    for (i in 0..input.size-1){
        val parts = input.get(i).split(" ", ":", "-")
        val startRange = parts[0].toInt()
        val stopRange = parts[1].toInt()
        val letter = parts[2].trim().single()
        val password = parts[4].toCharArray()

        if ((password[startRange-1] == letter)
                .xor( password[stopRange-1] == letter)) counter ++

    }
    println(counter)

}