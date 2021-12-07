package AoC.AoC2021.Dec4

import AoC.AoC2020.makeStringList
import java.util.*


class Dec4(data: List<String>) {

    var input = data
    val drawnBalls = input[0].split(",").map { it.toInt() }
    val nrOfBoards = (input.size -1) /6

    fun createMatrix() : List<List<Int>> {
        val inputPrepped = input.drop(2)
        val matrix : MutableList<MutableList<Int>> = mutableListOf()
        var boardlist: MutableList<Int> = mutableListOf()
        for (i in inputPrepped.indices) {
            if (inputPrepped[i].equals("")) {
                matrix.add(boardlist)
                boardlist= mutableListOf()   //cannot clear!!!
            }
            else{
               boardlist.addAll((inputPrepped[i].split("  ", ",", " ")).filter{it.isNotEmpty()}.map{it.toInt()})
            }
        }
        matrix.add(boardlist)   //must add last board
        return matrix
    }


    fun createScoreMatrix() : MutableList<MutableList<Int>>{
        val scoreMatrix : MutableList<MutableList<Int>> = mutableListOf()
        for (i in 0 ..nrOfBoards-1){
            scoreMatrix.add(IntArray(25) { 0 }.toMutableList())
        }
        return scoreMatrix
    }


    fun findWinningBoards(matrix : List<List<Int>>) : MutableList<Int> {
        val winningBoards: MutableList<Int> = mutableListOf()

        for ((j, board) in matrix.withIndex()){
            //println(board)
            if(board.chunked(5).any{it.sum() == 5}) winningBoards.add(j)   //horizontal win
            //incredibly ugly! Have to figure how to pick every nth element and add
            if (board[24]+board[4]+board[9]+board[14]+board[19] == 5) winningBoards.add(j)
            if (board[0]+board[5]+board[10]+board[15]+board[20] == 5) winningBoards.add(j)
            if (board[1]+board[6]+board[11]+board[16]+board[21] == 5) winningBoards.add(j)
            if (board[2]+board[7]+board[12]+board[17]+board[22] == 5) winningBoards.add(j)
            if (board[3]+board[8]+board[13]+board[18]+board[23] == 5) winningBoards.add(j)
            //todo vertical win
        }
        //return winningBoards.distinct().sorted().toMutableList()
        return winningBoards
    }

    fun findLosingBoard(boardNrList : MutableList<Int>) : Int{

        for (item in boardNrList) {
            if (Collections.frequency(boardNrList, item) == 1){
                return item
            }
        }

        return -1
    }

    fun addUnmarkedNumbers(board: List<Int>, scoreBoard: List<Int> ) : Int {
        var sum = 0
        for ((i, _) in board.withIndex()){
            if (scoreBoard[i] == 0)
                sum += board[i]
        }
        return sum
    }

    fun markDrawnBall(matrix : List<List<Int>>, scoreMatrix : MutableList<MutableList<Int>>, ball : Int) {
        for ((j, board) in matrix.withIndex()){
            if (board.contains(ball)){
                scoreMatrix[j][board.indexOf(ball)] = 1
            }
        }
    }

    fun solA(): Int {
        val matrix = createMatrix()
        val scoreMatrix = createScoreMatrix()
        var round = 1
        var winningBoards : MutableList<Int>

        for (i in drawnBalls){
            round++
            markDrawnBall(matrix , scoreMatrix , i)

            //kolla av om det blivit bingo
            if (round >= 5){  //innan 5, inget bingo
                winningBoards = findWinningBoards(scoreMatrix)
                if (winningBoards.size> 0 && winningBoards[0] != -1){
                    val unmarkedNumbers = addUnmarkedNumbers(matrix[winningBoards[0]],scoreMatrix[winningBoards[0]] )
                    return i * unmarkedNumbers
                }
            }
        }
        return 1
    }

    fun solB() : Int {

        val matrix = createMatrix()
        val scoreMatrix = createScoreMatrix()
        var round = 1
        val winningBoards : MutableList<Int> = mutableListOf()

        for (i in drawnBalls){
            round++
            markDrawnBall(matrix , scoreMatrix , i)

            //kolla av om det blivit bingo
            if (round >= 5){  //innan 5, inget bingo
                val newWinningBoards = findWinningBoards(scoreMatrix)
                winningBoards += newWinningBoards
                if (winningBoards.distinct().size == nrOfBoards ){
                    val losingBoard = findLosingBoard(winningBoards)
                    val unmarkedNumbers = addUnmarkedNumbers(matrix[losingBoard],scoreMatrix[losingBoard] )
                    return i * unmarkedNumbers
                }
            }
        }
        return 1
    }
}


    fun main(){
        val data: List<String> = makeStringList("src/AoC/AoC2021/Dec4/input.txt")
        println("Solution A: "+Dec4(data).solA())   //74320
        println("Solution B: "+Dec4(data).solB())
    }
