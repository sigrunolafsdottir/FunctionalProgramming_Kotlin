package AoC.AoC2021.Dec7

import AoC.AoC2020.createMatrix
import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList


class Dec7(data: List<Int>) {

    val input = data
    val maxVal = input.maxOrNull() ?: 0
    val minVal = input.minOrNull() ?: 0

    fun fillMatrixFunc(fuelFunc: (a: Int, b: Int) -> Int): Int{
        var matrix : MutableList<MutableList<Int>> = mutableListOf()
        for (i in minVal..maxVal){
            var templist: MutableList<Int> = mutableListOf()
            for (j in input){
                templist.add(fuelFunc(i, j))
            }
            matrix.add(templist)
        }
        return matrix.map{it.sum()}.minOrNull() ?: 0
    }

    //samma som ovan, men kompaktare
    fun fillMatrixFunc2(fuelFunc: (a: Int, b: Int) -> Int) =
        (minVal..maxVal).map{i -> input.map{j -> fuelFunc(i,j)}}.map{it.sum()}.minOrNull() ?: 0

    val fuelFuncA : (a: Int, b:Int) -> Int = { a,b -> Math.abs(a-b)}
    val fuelFuncB : (a: Int, b:Int) -> Int = { a,b -> (0..Math.abs(a-b)).sum()}

    fun solA(): Int = fillMatrixFunc(fuelFuncA)
    fun solB(): Int = fillMatrixFunc(fuelFuncB)

    fun solA2(): Int = fillMatrixFunc2(fuelFuncA)
    fun solB2(): Int = fillMatrixFunc2(fuelFuncB)
}


    fun main(){
        val data: List<Int> = makeIntListFromOneString("src/AoC/AoC2021/Dec7/input.txt")
        println("Solution A: "+Dec7(data).solA())
        println("Solution B: "+Dec7(data).solB())
        println()
        println("Solution A: "+Dec7(data).solA2())
        println("Solution B: "+Dec7(data).solB2())
    }
