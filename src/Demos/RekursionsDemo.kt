package Demos

fun main(){

  // 3! = 3 * 2 * 1


    fun fact(n : Int) : Int{
        if (n <= 1) return 1
        return n * fact(n-1)
    }

    //return: 3 * fact(2) = 3 * (2 * fact(1)) = 3 *(2 * 1) = 6


    fun factAcc (n : Int): Int{

        fun factInner(acc : Int, n : Int) : Int {
            if (n == 1) return acc
            else return factInner( n*acc, n-1)
        }

        return factInner(1, n)
    }

    println(factAcc(3))



    //println(fact(3))




}