package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main (){

    fun findMax(ints :List<Int>) : Int {

        tailrec fun evaluate(max :Int, counter :Int) : Int  {
            return if (counter == ints.size) max
            else evaluate(if (ints[counter] > max) ints[counter] else max, counter +1 )
        }

        var max = Int.MIN_VALUE
        //println(max)
        return evaluate(max, 0)
    }

    fun returnMaxValue(listInts: List<Int>, i: Int = 0):Int {
        return if(i == listInts.size-1) listInts.get(listInts.size-1)
        else Math.max(listInts.get(i), returnMaxValue(listInts,i+1))
    }

    println(returnMaxValue(listOf(1, -5, 3, -4, 10, 3, -6)))

    //println(findMax(listOf(1, -5, 3, -4, 10, 3, -6)))
}