package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main (){

    fun sum(ints :List<Int>) : Int {

        tailrec fun doSum(sum :Int, counter :Int) : Int  {
            return if (counter == ints.size) sum
            else doSum(sum+ints.get(counter), counter +1 )
        }

        var sum = 0
        return doSum(sum, 0)
    }


    println(sum(listOf(1, 5, 3, 4, 10, -3, 6)))
}