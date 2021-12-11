package AoC.AoC2021.Dec9

import AoC.AoC2020.*
import java.io.File


class Dec9(data: List<List<Int>>) {

    val input = data
    val paddedInput = padMatrix()
    var matrix = createMatrix(input[0].size, input.size, 0)
    var lowList : MutableList<Pair<Int, Int>> = mutableListOf()

    fun padMatrix() : MutableList<MutableList<Int>> {
        //måste finnas ett bättre sätt att kopiera matriser!!!
        var paddedInput = createMatrix(input[0].size, input.size, 0)
        for (i in 0..input.size -1){
            paddedInput[i] = input[i].toMutableList()
        }

        for (i in 0..paddedInput.size-1){
            paddedInput[i].add(0,10)
            paddedInput[i].add(10)
        }
        paddedInput.add(0, createIntList(paddedInput[0].size, 10))
        paddedInput.add(createIntList(paddedInput[0].size, 10))
        return paddedInput
    }

    fun getInitialMatrix() : MutableList<MutableList<Int>> {
        val h = paddedInput.size
        val w = paddedInput[0].size
        var numberOfLows = 0
        for (i in 1..h-2) {
            for (j in 1..w-2) {
                if (paddedInput[i][j] < paddedInput[i-1][j] && paddedInput[i][j] < paddedInput[i+1][j] &&
                    paddedInput[i][j] < paddedInput[i][j-1] && paddedInput[i][j] < paddedInput[i][j+1]   ){
                    matrix[i-1][j-1] = paddedInput[i][j]+1
                    lowList.add(Pair(i, j))
                    numberOfLows++
                }
            }
        }
        return matrix
    }

    fun solA() = getInitialMatrix().sumOf{it.sum()}

    fun myContains(list: Set<Pair<Int, Int>>, pair: Pair<Int, Int>) : Boolean {
        for (p in list){
            if (p.first == pair.first && p.second == pair.second) return true
        }
        return false
    }

    fun getBasinSize (coordList : MutableSet<Pair<Int, Int>>, count: Int) : Int {
        var newCoords : MutableSet<Pair<Int, Int>> = mutableSetOf()
        var sum = 0
        for (p in coordList){
                if (paddedInput[p.first-1][p.second] < 9) {
                    var p: Pair<Int, Int> = Pair(p.first-1, p.second)
                    if (!(myContains(coordList, p)) && !(myContains(newCoords, p))) {
                        newCoords.add(p)
                        sum++
                    }

                }
                if (paddedInput[p.first+1][p.second] < 9) {
                    var p: Pair<Int, Int> = Pair(p.first+1, p.second)
                    if (!(myContains(coordList, p)) && !(myContains(newCoords, p))) {
                        newCoords.add(p)
                        sum++
                    }

                }
                if (paddedInput[p.first][p.second-1] < 9) {
                    var p: Pair<Int, Int> = Pair(p.first, p.second-1)
                    if (!(myContains(coordList, p)) && !(myContains(newCoords, p))) {
                        newCoords.add(p)
                        sum++
                    }

                }
                if (paddedInput[p.first][p.second+1] < 9) {
                    var p: Pair<Int, Int> = Pair(p.first, p.second+1)
                    if (!(myContains(coordList, p)) && !(myContains(newCoords, p))) {
                        newCoords.add(p)
                        sum++
                    }

                }
            }
            coordList.addAll(newCoords)

        if (sum == 0) {
            return count
        }
        else {
            return getBasinSize(coordList, sum+count)
        }

        return count
    }



    fun solB(): Int {
        var initialMatrix = getInitialMatrix()
        var resList : MutableList<Int> = mutableListOf()   //for storing sizes of basins
        var pairList : MutableSet<Pair<Int, Int>> = mutableSetOf()
        for (p in lowList){
            pairList = mutableSetOf()
            pairList.add(p)
           // println("working on "+p)
            resList.add(getBasinSize(pairList, 1))
        }
        println(" reslist "+resList)

        return resList.sortedDescending().take(3).reduce { x, y -> x * y }
    }


}


    fun main(){
        val data: List<List<Int>> = makeIntListFromConcatenatedString("src/AoC/AoC2021/Dec9/input.txt")
        println("Solution A: "+Dec9(data).solA())
        println("Solution B: "+Dec9(data).solB())
    }
