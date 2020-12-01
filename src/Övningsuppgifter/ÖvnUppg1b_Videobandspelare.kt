package Övningsuppgifter

//Program skrivet med en mer Kotlin-specifik approach
//All length in Minutes

fun main() {

    fun programLength(startH: Int, startM: Int, stopH: Int, stopM: Int): Int =
        60*(stopH - startH) + stopM - startM

    fun lengthLeft(fullLen: Int, takenLen: Int): Int = fullLen - takenLen

    fun doesProgramFitOnTape(lenVideo: Int, lenProgram: Int): Boolean =
        if (lenVideo - lenProgram >= 0) true else false


    fun enoughTime(fullVideoLen: Int, takenVideoLen: Int, startH: Int, startM: Int, stopH: Int, stopM: Int)
            : Boolean =
        doesProgramFitOnTape(lengthLeft(fullVideoLen, takenVideoLen),
            programLength(startH, startM, stopH, stopM))


    println(enoughTime(90, 30, 20, 0, 20, 30))
    println(enoughTime(90, 30, 20, 45, 21, 15))
    println(enoughTime(90, 30, 20, 30, 21, 15))
    println(enoughTime(90, 30, 20, 15, 21, 30))
    println(enoughTime(90, 80, 20, 0, 20, 30))
}