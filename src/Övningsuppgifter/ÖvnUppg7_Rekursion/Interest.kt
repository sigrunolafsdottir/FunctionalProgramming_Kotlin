package Övningsuppgifter.ÖvnUppg7_Rekursion

import java.time.LocalTime

fun main(){
    // ränta anges i procent
    tailrec fun getInterest(amount :Double, years: Int, interest: Double) : Double  {
        return if (years == 0) amount
        else {
            getInterest (amount + amount*interest / 100, years-1, interest)
        }
    }

    println(getInterest(100.0, 3, 10.0))
}

// första gången: 100, 3, 10
// andra gången: 110, 2, 10
//tredje gången: 121, 1, 10
//fjärde gången: 133, 0, 10