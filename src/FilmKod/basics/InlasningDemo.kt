package FilmKod.basics


import kotlin.NumberFormatException


fun reader() = readLine()

fun readNumber1() = readLine()!!.toInt()

fun readNumber2() = readLine()?.toInt()


fun main(){
    try {
        while (true) {
            println(readNumber2())
        }
    }
    catch(e : NumberFormatException){
        //e.printStackTrace()
        println("Du måste skriva ett nummer!")
    }
    catch(e : Exception){
        //e.printStackTrace()
        println("Okänt fel")
    }
}