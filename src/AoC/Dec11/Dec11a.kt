package AoC.Dec11

import java.io.File

fun main(){

    val input: List<String> = File("src/AoC/Dec11/input_mini.txt")
        .readLines()

    fun swap(c : Char) : Char {
        return if (c.equals('#')) 'L' else '#'
    }

    fun getSeat(c: Char, x : Int, y : Int) : Char {
        return c  //så länge))
    }

    fun roundOfGame(oldBoard : List<String>) {
        var newBoard :  MutableList<String> = oldBoard.toMutableList()

        for ((indexH, line) in oldBoard.withIndex()) {
            for ((indexV, line) in oldBoard.withIndex()) {
                //newBoard.get(indexH).replace
            }
        }


    }

}