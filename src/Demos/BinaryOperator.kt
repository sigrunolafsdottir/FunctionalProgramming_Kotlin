package Demos

fun main(){

    val addition: (x : Double, y: Double) -> Double = {x, y -> x+y}

    //exempel anrop
    println(addition(3.0, 5.4))

    //addition utan funktion
    val addTest: Double = 4.0+6.7

    fun add(x : Double, y: Double) = x+y   //classic function, just for comparation

    val subtraction: (x : Double, y: Double) -> Double = {x, y -> x - y}

    val multiplication: (x : Double, y: Double) -> Double = {x, y -> x * y}

    val division: (x : Double, y: Double) -> Double = {x, y -> x / y}

    fun calculator(calculate : (Double, Double) -> Double){
        println("Skriv in ett värde:")
        val x = readln().toDouble()
        println("Skriv in ytterligare ett värde:")
        val y = readln().toDouble()

        println(calculate(x,y))
    }

    calculator(addition)
    calculator(::add)
    calculator(subtraction)
    calculator(multiplication)
    calculator(division)

}