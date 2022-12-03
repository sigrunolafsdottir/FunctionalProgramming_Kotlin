package AoC.AoC2022.Dec1

import java.io.File


class Dec1(data: List<String>) {

    val input = data

    fun getSortedCalorieList() : MutableList<Int>{
        var tempSum : Int = 0
        var aggList : MutableList<Int> = mutableListOf()

        for (i in 0 until input.size-1) {
            if (input.get(i).equals("")){
                aggList.add(tempSum)
                tempSum = 0
            }
            else{
                tempSum += input.get(i).toInt()
            }
        }

        return aggList.sortedDescending().toMutableList()
    }

    fun solA() : Int = getSortedCalorieList().first()

    fun solB() : Int = getSortedCalorieList().take(3).sum()

}


fun main(){
    val data: List<String> = File("src/AoC/AoC2022/Dec1/input.txt").readLines()
    println("Solution A: "+ Dec1(data).solA())
    println("Solution B: "+ Dec1(data).solB())

}