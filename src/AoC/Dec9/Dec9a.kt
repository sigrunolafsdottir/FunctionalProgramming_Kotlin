package AoC.Dec9

import java.io.File

fun main(){

    val input: List<Long> = File("src/AoC/Dec9/input.txt").readLines().map{it.toLong()}
    val preambleLength = 25

    fun hasAdders(list : List<Long>, nr: Long) : Boolean{
        for (i in 0..list.size-1){
            for (j in i+1..list.size-1){
                if (list.get(i) + list.get(j) == nr)
                    return true
            }
        }
        return false   //hittade inget svar
    }


    fun possibleAddition(): Long {
        for (i in 0..input.size-preambleLength-1){
            if (!hasAdders(input.subList(i, i+preambleLength), input.get(i + preambleLength)))
                return input.get(i + preambleLength)
        }

        return -1
    }


    println(possibleAddition())


}