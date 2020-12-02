package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main() {

    fun fib(prevPrev: Int, prev: Int) {
        val next = prevPrev + prev
        println(next)
        if (next > 100) System.exit(0)
        fib(prev, next)
    }
    println(fib(1, 2))
}