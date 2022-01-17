package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main(){

    tailrec fun getInterest(amount : Double, years: Int, interest : Double) : Double{
       // println("$years $amount ${amount + amount * interest/100}")
      return if (years == 0) amount
        else getInterest(amount + amount * interest/100, years-1, interest)

    }


    //println(getInterest(100.0, 2, 10.0))
    println(getInterest(100.0, 5, 10.0))



}