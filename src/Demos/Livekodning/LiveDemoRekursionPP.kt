package Demos.Livekodning



fun interest(amount : Double, years : Int, interest : Double) : Double{

    tailrec fun inner(acc: Double, years : Int) : Double {
        return if (years == 0)  acc
        else inner(acc + (acc*interest), years-1 )
    }

    return inner(amount, years)
}



fun main(){
    println(interest( 100.0, 3, 0.1))
}