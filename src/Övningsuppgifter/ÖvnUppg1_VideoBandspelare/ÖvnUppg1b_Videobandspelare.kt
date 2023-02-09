package Övningsuppgifter.ÖvnUppg1_VideoBandspelare

//Program skrivet med en mer Kotlin-specifik approach
//All length in Minutes

fun main() {
//                     19            45            20         30
    fun programLength(startH: Int, startM: Int, stopH: Int, stopM: Int) =
        60*(stopH - startH) + stopM - startM

    fun lengthLeft(fullLen: Int, takenLen: Int) = fullLen - takenLen

    fun doesProgramFitOnTape(lenVideo: Int, lenProgram: Int) =
        lenVideo - lenProgram >= 0

    fun enoughTime(fullVideoLen: Int, takenVideoLen: Int, startH: Int, startM: Int, stopH: Int, stopM: Int) =
        doesProgramFitOnTape(lengthLeft(fullVideoLen, takenVideoLen),
            programLength(startH, startM, stopH, stopM))

    println(enoughTime(90, 30, 20, 0, 20, 30))
    println(enoughTime(90, 30, 20, 45, 21, 15))
    println(enoughTime(90, 30, 20, 30, 21, 15))
    println(enoughTime(90, 30, 20, 15, 21, 30))
    println(enoughTime(90, 80, 20, 0, 20, 30))
}