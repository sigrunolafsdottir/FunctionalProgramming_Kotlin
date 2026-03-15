package Övningsuppgifter.ÖvnUppg2_loopar



fun main(){

    fun printEvenNumbers() {
        for (x in 20 downTo 1) if (x %2 == 0) println(x)
    }

    fun printEvenNumbers2(){
        for (x in 20 downTo 1 step 2) println(x)
    }

    fun printMultiplication(table: Int, start: Int, stop: Int) {
        for (x in start..stop) println(table * x)
    }

    fun isThisAPrime(primeCandidate: Int) : Boolean{

        if (primeCandidate == 1 || primeCandidate == 2) return false

        for (x in 2..primeCandidate/2) {
            if (primeCandidate % x == 0) return false
        }
        return true
    }

    printEvenNumbers()
    println()
    printEvenNumbers2()
    println()
    printMultiplication(7, 2, 10)
    println()
    println(isThisAPrime(22))
    println(isThisAPrime(13))
    println(isThisAPrime(9))
    println(isThisAPrime(3))
    println(isThisAPrime(2))
    println(isThisAPrime(1))
}


