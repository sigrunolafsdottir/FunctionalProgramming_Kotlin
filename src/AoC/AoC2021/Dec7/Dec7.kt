package AoC.AoC2021.Dec7

import AoC.AoC2020.createMatrix
import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList


class Dec7(data: List<Int>) {

    val input = data
    val maxVal = input.max()!!


    fun fillMatrixFunc(fuelFunc: (a: Int, b: Int) -> Int): MutableList<MutableList<Int>>{
        var matrix : MutableList<MutableList<Int>> = mutableListOf()
        for (i in 0..maxVal){
            var templist: MutableList<Int> = mutableListOf()
            for (j in input){
                templist.add(fuelFunc(i, j))
            }
            matrix.add(templist)
        }
        return matrix
    }

    val fuelFuncA : (a: Int, b:Int) -> Int = { a,b -> Math.abs(a-b)}
    val fuelFuncB : (a: Int, b:Int) -> Int = { a,b -> (0..Math.abs(a-b)).sum()}

    fun solA(): Int = fillMatrixFunc(fuelFuncA).map{it.sum()}.min()!!
    fun solB(): Int = fillMatrixFunc(fuelFuncB).map{it.sum()}.min()!!
}


    fun main(){
        val data: List<Int> = makeIntListFromOneString("src/AoC/AoC2021/Dec7/input.txt")
        println("Solution A: "+Dec7(data).solA())
        println("Solution B: "+Dec7(data).solB())
    }
