package Övningsuppgifter.ÖvnUppg2_loopar


fun printEvenNumbers(){
    for (x in 20 downTo 1) if (x %2 == 0) println(x)
}

fun printEvenNumbers2(){
    for (x in 20 downTo 1 step 2) println(x)
}

fun printMultiplication(table: Int, start: Int, stop: Int){
    for (x in start..stop) println(table * x)
}

fun isThisAPrime(primeCandidate: Int) : Boolean{
    for (x in 2..primeCandidate/2 step 2) {   /// eg. vill man skära bort alla siffror som inte är primtal
        if (primeCandidate % x == 0) return false
    }
    return true
}

fun main(){
    printEvenNumbers()
    println()
    printEvenNumbers2()
    println()
    printMultiplication(7, 1, 10)
    println()
    println(isThisAPrime(22))
    println(isThisAPrime(13))
}


