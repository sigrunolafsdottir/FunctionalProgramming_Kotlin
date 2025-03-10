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
        else {
            //println(listInts.get(i))
            Math.max(listInts.get(i), returnMaxValue(listInts, i + 1))
        }
    }

    fun returnMaxValue2(listInts: List<Int>, i: Int = 0):Int {
        if(i == listInts.size-1) return listInts.get(listInts.size-1)
        else {
            return Math.max(listInts.get(i), returnMaxValue(listInts, i + 1))
        }
    }

    //steg 1: max (1, rMV(-5, 3))
    //steg 2: max (1, max (-5, rMV( 3)))
    //steg 3: max (1, max (-5, 3))
    //steg 4: max (1, 3)
    //steg 5: svar: 3


    println(returnMaxValue(listOf(10, 5, 3)))

    //println(findMax(listOf(1, -5, 3, -4, 10, 3, -6)))
}