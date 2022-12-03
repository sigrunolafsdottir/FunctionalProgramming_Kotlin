package AoC.AoC2022.Dec3

import AoC.AoC2020.makePairList4
import java.io.File


class Dec3(data: List<String> ) {

    val input = data

    //in A just one letter as result, in B there can be more than one letters
    fun findDoubletteLetters(s1 : String, s2: String) : String {
        return s1.filter { s2.contains(it)}
    }

    fun findTripletteLetter(s1: String, s2 : String, s3 : String) : Char{
        return findDoubletteLetters(findDoubletteLetters(s1, s2), s3).first()
    }

    //a-z 1-26
    //A-Z 27-52
    fun convertLetterToVal (c : Char ) : Int{
        if (c.isUpperCase()) return c.code - 38
        return c.code - 96
    }

    fun solA() : Int {
        var vals : MutableList<Int> = mutableListOf()
        var c : Char
        for (i in input) {
            var (a,b) = Pair(i.substring(0, i.length/2), i.substring(i.length/2))  //splittar
            c = findDoubletteLetters(a, b).first()
            vals.add(convertLetterToVal(c))
        }
        return vals.sum();
    }

    //variant med map
    fun solA2() = input.map{Pair(it.substring(0, it.length/2), it.substring(it.length/2)) }
            .map{findDoubletteLetters(it.first, it.second).first()}
            .map{convertLetterToVal(it)}.sum()


    fun solB() : Int {
        var vals : MutableList<Int> = mutableListOf()
        var c : Char
        for (i in 0..input.size-1 step 3){
            c = findTripletteLetter(input.get(i), input.get(i+1), input.get(i+2))
            vals.add(convertLetterToVal(c))
        }
        return vals.sum();
    }


    fun solB2() : Int = (0..input.size-3 step 3)
        .map{findTripletteLetter(input[it], input[it+1], input[it+2])}
        .map{convertLetterToVal(it)}.sum()

}


fun main(){
    val data: List<String> = File("src/AoC/AoC2022/Dec3/input.txt").readLines()
    println("Solution A: "+ Dec3(data).solA())
    println("Solution A: "+ Dec3(data).solA2())
    println("Solution B: "+ Dec3(data).solB())
    println("Solution B: "+ Dec3(data).solB2())

}