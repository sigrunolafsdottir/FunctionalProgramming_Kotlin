package Demos

//vi kan testa mot de råa strängarna i switchen också
//dvs "yes" och "no"

fun main() {
    while (true) {
        val choice = readLine()
        when (choice) {
            "yes" -> println("Hooray!")
            "no" -> println("Too bad!")
            "hej" -> println("hej på dig")
            else -> println("What?")
        }
    }
}