package AoC.Dec9

import java.io.File

fun main(){

    val input: List<Long> = File("src/AoC/Dec9/input.txt").readLines().map{it.toLong()}
    val target: Long = 26134589  //from uppg9A

    fun findRange(list : List<Long>) : List<Long>{
        var counter : Int = 0
        var sum : Long = 0
        for(i in 0..list.size){
            sum += list.get(i)
            counter ++
            if (sum == target) return list.subList(0, i+1)
            else if (sum > target) return listOf()
        }
        return listOf()
    }


    fun isItAddingUp() : Long{
        for (i in 0..input.size-1){
            val sublist = findRange(input.subList(i, input.size-1))
            if (sublist.size > 0){
                return sublist.min()!!.plus(sublist.max()!!)
            }
        }
        return -1
    }


    println(isItAddingUp())


}