package Demos

//vi kan testa mot de råa strängarna i switchen också
//dvs "yes" och "no"

fun main() {
    //val yes = "yes"
    //val no = "no"
    while (true) {
        val choice = readLine()!!.toInt()
        when (choice) {
            1,3,5,7,9 -> println("Hooray!")
            2,4,6 -> println("Too bad!")
            else -> println("What?")
        }
    }
}