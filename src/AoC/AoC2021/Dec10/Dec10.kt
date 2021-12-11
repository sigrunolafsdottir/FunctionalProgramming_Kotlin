package AoC.AoC2021.Dec10

import AoC.AoC2020.createMatrix
import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList


class Dec10(data: List<String>) {

    val input = data
    val scoreMapA = mapOf(
        ')' to 3,
        '}' to 1197,
        ']' to 57,
        '>' to 25137
    )

    val scoreMapB = mapOf(
        ')' to 1,
        '}' to 3,
        ']' to 2,
        '>' to 4
    )

    val matchMap = mapOf(
        '(' to ')',
        '{' to '}',
        '[' to ']',
        '<' to '>'
    )

    val matchMapOpp = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '[',
        '>' to '<'
    )

    val openingChars  = setOf('(', '{', '[', '<')
    val closingChars  = setOf(')', '}', ']', '>')

    var listOfRests: MutableList<List<Char>> = mutableListOf()

    fun evalStack(s: String) : Int {
        var stack = ArrayDeque<Char>()
        for (c in s){
            if (c in openingChars ){
                stack.add(c)
            }
            if (c in closingChars ){
                if (stack.last() == matchMapOpp.get(c)){
                    stack.removeLast()
                }
                else{
                    return scoreMapA.get(c) ?: 0
                }
            }
        }
        listOfRests.add(stack.reversed().map{matchMap.get(it)!!})   // för b-uppgiften
        return 0
    }

    fun solA() = input.map{evalStack(it)}.sum()

    fun calculateScoreB() : Long {
        var tot = 0
        var scoreList : MutableList<Long> = mutableListOf()
        for ( line in listOfRests){
            var temp = 0L
            for (c in line){
                temp = temp * 5 + (scoreMapB.get(c) ?: 0)
            }
            scoreList.add(temp)
        }
        scoreList = scoreList.sorted().toMutableList()
        return scoreList[scoreList.size/2]
    }

    fun solB(): Long {
        for ( i in input){
            evalStack(i)   //fyller på i listOfRests
        }
        return calculateScoreB()
    }


}


    fun main(){
        val data: List<String> = makeStringList("src/AoC/AoC2021/Dec10/input.txt")
        println("Solution A: "+Dec10(data).solA())
        println("Solution B: "+Dec10(data).solB())
    }
