package Övningsuppgifter.ÖvnUppg3_gissaTalet


fun main (){
    var randomNumber = (1..10).random()
    println("Gissa en siffra mellan 1 och 10")
    while(true) {

        val guessed = readLine()!!.toInt()
        val guessed1 = readLine()?.toInt() ?: 5
        val guessed2 = readln().toInt()

        if (randomNumber == guessed) {
            println("Det var rätt.")
            randomNumber = (1..10).random()
            println("Gissa en siffra mellan 1 och 10")
        }
        else {
            if (randomNumber > guessed) {
                println("För lågt, gissa igen")
            }
            else if (randomNumber < guessed) {
                println("För högt, gissa igen")
            }
        }
    }
}