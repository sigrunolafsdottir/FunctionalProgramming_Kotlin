package Demos

fun main(){

    val addition: (x : Double, y: Double) -> Double = {x, y -> x + y}

    val subtraction: (x : Double, y: Double) -> Double = {x, y -> x - y}

    val multiplication: (x : Double, y: Double) -> Double = {x, y -> x * y}

    val division: (x : Double, y: Double) -> Double = {x, y -> x / y}

    fun calculator(calculate : (Double, Double) -> Double){
        println("Skriv in ett värde:")
        val x = readLine()!!.toDouble()
        println("Skriv in ytterligare ett värde:")
        val y = readLine()!!.toDouble()

        println(calculate(x,y))
    }

    calculator(addition)
    calculator(subtraction)
    calculator(multiplication)
    calculator(division)

}