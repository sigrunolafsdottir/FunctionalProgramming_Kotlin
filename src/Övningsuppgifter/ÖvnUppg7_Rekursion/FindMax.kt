package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main (){

    fun findMax(ints :List<Int>) : Int {

        tailrec fun evaluate(max :Int, counter :Int) : Int  {
            return if (counter == ints.size) max
            else evaluate(if (ints.get(counter) > max) ints.get(counter) else max, counter +1 )
        }

        var max = Int.MIN_VALUE
        return evaluate(max, 0)
    }


    println(findMax(listOf(1, -5, 3, -4, 10, 3, -6)))
}