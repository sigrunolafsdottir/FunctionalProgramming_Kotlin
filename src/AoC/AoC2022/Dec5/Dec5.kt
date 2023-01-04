package AoC.AoC2022.Dec5

import AoC.AoC2020.makePairList2
import java.io.File


class Dec5(data: List<String>) {

    val input = data

    val blankRowIndex = findBlankRowIndex()
    val numberOfStacks = findNumberOfStacks()
    val crates : MutableList<ArrayDeque<Char>> = mutableListOf()
    val instructions = slashInput()

    fun findNumberOfStacks() = input.get(blankRowIndex-1).last().toString().toInt()

    fun findBlankRowIndex()= (0.. input.size-1).first{input.get(it).trim().isBlank()}

    fun loadCrates()  {

        for (i in 0..numberOfStacks -1){
            crates.add(ArrayDeque())
        }

        for(i in 0 .. blankRowIndex-2){
            for (j in 0..numberOfStacks-1){
                if (input.get(i).length > j*4+1 && input.get(i)[j*4+1].isUpperCase()){
                    crates.get(j).addLast(input.get(i)[j*4+1])
                }
            }
        }
    }

    fun slashInput() = input.subList(blankRowIndex+1, input.size)

    fun moveCratesA(num: Int, from: Int, to: Int) {
        var temp  : Char
        for (i in 0..num-1){
            temp = crates.get(from-1).first()
            crates.get(from-1).removeFirst()
            crates.get(to-1).addFirst(temp)
        }
    }

    fun moveCratesB(num: Int, from: Int, to: Int) {

        var temp : MutableList<Char> = mutableListOf()
        for (i in 0..num-1){
            temp.add(crates.get(from-1).first())
            crates.get(from-1).removeFirst()
        }
        for (i in num-1 downTo 0){
             crates.get(to-1).addFirst((temp[i]))
        }
    }

    fun solA()  {
        loadCrates()
        for (i in 0..instructions.size -1){
            val nrs = instructions.get(i).split(" ")
            moveCratesA(nrs[1].toInt(), nrs[3].toInt(), nrs[5].toInt())
        }
        crates.forEach{print(it.first())}
        println()
    }

    fun solB()  {
        loadCrates()
        for (i in 0..instructions.size -1){
            val nrs = instructions.get(i).split(" ")
            moveCratesB(nrs[1].toInt(), nrs[3].toInt(), nrs[5].toInt())
        }
        crates.forEach{print(it.first())}
        println()
    }
}

fun main(){
    val data: List<String> = File("src/AoC/AoC2022/Dec5/input.txt").readLines()
    Dec5(data).solA()
    Dec5(data).solB()
}


