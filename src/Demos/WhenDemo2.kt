package Demos

//vi kan testa mot de råa strängarna i switchen också
//dvs "yes" och "no"

fun main() {
    val yes = "yes"
    val no = "no"
    while (true) {
        val choice = readLine()
        when  {
            choice.equals(yes) -> println("Hooray!")
            choice.equals(no) -> println("Too bad!")
            else -> println("What?")
        }
    }
}