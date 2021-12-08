package AoC.AoC2020.Dec10

import java.io.File

fun main(){
/*
    val input2: List<Int> = File("src/AoC/Dec10/input.txt")
        .readLines().map{it.toInt()}


    fun calc2() : Int{
        var counter1 = 0
        var counter3 = 0

        val list2 : MutableList<Int> = input2.toMutableList()
        list2.add(0,0)
        list2.add(list2.size, list2.max()!!+3)
        list2.sort()

        println(list2)

        for (i in 0..list2.size-2){
            when{
                (list2.get(i+1) - list2.get(i) == 1) -> counter1++
                (list2.get(i+1) - list2.get(i) == 3) -> counter3++
            }
        }
        return counter1 * counter3
    }

    //Alternativt sätt, upphittat på nätet
    fun calc3() : Int{

        val list2 : MutableList<Int> = input2.toMutableList()
        list2.add(0,0)
        list2.add(list2.size, list2.max()!!+3)
        list2.sort()

        return list2.zipWithNext { a, b -> b - a }.groupingBy { it }
            .eachCount()
            .values
            .reduce(Int::times)


    }


    //println(input)
    println(calc2())
    println(calc3())
*/
}