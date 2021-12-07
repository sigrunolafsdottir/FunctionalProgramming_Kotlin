package AoC.AoC2020.Dec2

import java.io.File

fun main (){

    val input: List<String> = File("src/AoC/Dec2/input.txt").readLines()
    var counter : Int = 0

    val uppgA: (password: CharArray, letter: Char, startRange: Int, stopRange: Int) -> Boolean =
        {password, letter, startRange, stopRange ->
             (password.filter{ it == letter}.count() in startRange..stopRange)}


    val uppgB: (password: CharArray, letter: Char, startRange: Int, stopRange: Int) -> Boolean =
        {password, letter, startRange, stopRange ->
            (password[startRange-1] == letter).xor( password[stopRange-1] == letter)}

// samma, men en ren funktion (inte sparad i en parameter)
    fun uppgB2( password: CharArray, letter: Char, startRange: Int, stopRange: Int) : Boolean =
        (password[startRange-1] == letter).xor( password[stopRange-1] == letter)


    fun doStuff(action: (CharArray, Char, Int, Int) -> Boolean) :Int {
        counter = 0
        for (i in 0..input.size - 1) {
            val parts = input.get(i).split(" ", ":", "-")
            val startRange = parts[0].toInt()
            val stopRange = parts[1].toInt()
            val letter = parts[2].trim().single()
            val password = parts[4].toCharArray()
            if (action(password, letter, startRange, stopRange)) counter++
        }
        return counter
    }


    println(doStuff(uppgA))
    println(doStuff(uppgB))

    //Alternativ där vi passar en funktion
    println(doStuff(::uppgB2))

}