package AoC.Dec2

import java.io.File

fun main ()  {

    val fileName : String = "src/AoC/Dec2/input.txt"
    val input: List<String> = File(fileName).readLines()
    var counter : Int = 0

    for (i in 0..input.size-1){
        val parts = input.get(i).split(" ")
        val range = parts[0].split("-")
        val letter = parts[1].substring(0, parts[1].length - 1).single();
        val password = parts[2]
        val countOccurrences = password.filter{ it == letter}.count()
        if (countOccurrences in range[0].toInt()..range[1].toInt())  counter++

        //println("${input.get(i)} $letter $password $countOccurrences $counter")
    }
    println(counter)

}