package Demos

//vi kan testa mot de råa strängarna i switchen också
//dvs "yes" och "no"

fun main() {
    val yes = "yes"
    val no = "no"
    while (true) {
        val choice = readLine()
        when (choice) {
            yes, "ja" -> println("Hooray!")
            no, "nej" -> println("Too bad!")
            else -> println("What?")
        }
    }
}