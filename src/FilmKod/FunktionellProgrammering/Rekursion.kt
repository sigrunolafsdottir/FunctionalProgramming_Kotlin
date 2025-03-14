package FilmKod.FunktionellProgrammering

import java.time.LocalTime

//3! = 3*2*1

tailrec fun fact(n:Long) : Long{
    if (n<= 1) return 1
    return n * fact(n-1)
}

// fact (3) => return 3*fact(2) => return 3 * ( 2 * fact(1))  => return 3 * ( 2 * 1) => 6

fun factAcc(n : Long) : Long{

    tailrec fun factInnerAcc(acc: Long, n: Long):Long{
        if (n==1L) return acc
        else return factInnerAcc(n*acc, n-1)
    }
    return factInnerAcc(1, n)
}


fun main(){
    println(LocalTime.now())
    println(fact(30))   // 3! = 3*2*1
    println(LocalTime.now())
    //println(factAcc(3))
}