package Övningsuppgifter.Rekursion

fun factorial(n: Long): Long {
    if (n <= 1) return 1
    return n * factorial(n - 1)
}

fun factorialWithAccumulator(n: Int): Int {
    fun factorialAccumulator(acc: Int, n: Int): Int {
        return if (n == 0) acc
            else factorialAccumulator(n*acc, n-1)
    }
    return factorialAccumulator(1, n)
}

fun main(){
    println(factorial(6))
    println(factorialWithAccumulator(6))
}
