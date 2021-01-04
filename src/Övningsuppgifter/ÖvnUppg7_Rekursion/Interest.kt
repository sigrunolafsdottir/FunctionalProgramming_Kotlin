package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main(){
    // ränta anges i procent
    tailrec fun getInterest(amount :Double, years: Int, interest: Double) : Double  {
        return if (years == 0) amount
        else getInterest ((amount + amount*interest / 100), years-1, interest)
    }


    println(getInterest(100.0, 2, 10.0))

}