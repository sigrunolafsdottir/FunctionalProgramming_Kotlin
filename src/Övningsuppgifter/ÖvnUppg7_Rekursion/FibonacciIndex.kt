package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main() {

    tailrec fun fib(prevPrev: Int, prev: Int, i : Int) {
        val next = prevPrev + prev
        when  {
            (i == 0) -> println(1)
            (i == 1) -> println(2)
            (i-2 == 0) -> println(next)
        }
        if (i <= 2) System.exit(0)
        fib(prev, next, i -1)
    }

    println(fib(1, 2, 5))
}