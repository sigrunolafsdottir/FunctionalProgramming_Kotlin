package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main (){


    fun sum(ints :List<Int>) : Int {

        tailrec fun doSum(sum :Int, counter :Int) : Int  {
            //println(sum)
            return if (counter == -1) sum
            else doSum(sum+ints[counter], counter -1 )
        }

        return doSum(0, ints.size-1)
    }

    println(sum(listOf(1, 5, 3, 4, 10, -3, 6)))
}