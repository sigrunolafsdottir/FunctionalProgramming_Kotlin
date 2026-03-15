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

    fun sum2(l : List<Int>, index : Int = 0, sum : Int = 0): Int {
        if (index == l.size) return sum
        else return sum2(l, index+1, sum + l.get(index))
    }

    println(sum(listOf(1, 5, 3, 4, 10, -3, 6)))
}