package Övningsuppgifter.ÖvnUppg3_gissaTalet


fun main (){
    var randomNumber = (1..10).random()
    println("Gissa en siffra mellan 1 och 10")
    while(true) {
        try{
            val guessed = readLine()!!.toInt()
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
        }catch(e : NumberFormatException){
            //println(e.printStackTrace())
            println("Inte ett giltigt tal, skriv in ett nytt nummer")
        }
        catch(e : Exception){
            //Om någon annan exception skulle inträffa
            //println(e.printStackTrace())
            println("Oväntat fel, skriv in ett nytt nummer")
        }
    }
}