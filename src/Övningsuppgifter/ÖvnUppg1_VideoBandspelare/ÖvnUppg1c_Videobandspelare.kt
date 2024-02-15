package Övningsuppgifter.ÖvnUppg1_VideoBandspelare

//Program skrivet med en mer Kotlin-specifik approach
//All length in Minutes

fun main() {

    //extremvariant. Ganska obegriplig, men allt sker på en rad
    fun enoughTime(fullVideoLen: Int, takenVideoLen: Int, startH: Int, startM: Int, stopH: Int, stopM: Int) =
        (fullVideoLen - takenVideoLen) > (60*(stopH - startH) + stopM - startM)

    println(enoughTime(90, 30, 20, 0, 20, 30))
    println(enoughTime(90, 30, 20, 45, 21, 15))
    println(enoughTime(90, 30, 20, 30, 21, 15))
    println(enoughTime(90, 30, 20, 15, 21, 30))
    println(enoughTime(90, 80, 20, 0, 20, 30))
}