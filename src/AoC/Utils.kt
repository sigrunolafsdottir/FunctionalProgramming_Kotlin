package AoC.AoC2020

import java.io.File


fun makeIntList (fileName : String) = File(fileName).readLines().map{it.toInt()}

fun makeIntListFromOneString (fileName : String) = File(fileName).readLines().get(0).split(",").map{it.toInt()}

fun makeIntListFromBinary (fileName : String) = File(fileName).readLines().map{it.toInt(2)}

fun makePairList (fileName : String) = File(fileName).readLines().map{Pair(it.split(" ").first(), it.split(" ").last().toInt()) }
fun makePairList2 (fileName : String, delimiter: String) = File(fileName).readLines().map{Pair(it.split(delimiter).first().trim(), it.split(delimiter).last().trim()) }


fun makeLongList (fileName : String) = File(fileName).readLines().map{it.toLong()}

fun makeStringList (fileName : String) = File(fileName).readLines()

fun createMatrix(x : Int, y : Int, start : Int) : MutableList<MutableList<Int>>{
    var matrix : MutableList<MutableList<Int>> = mutableListOf()
    for (i in 0 ..y-1){
        matrix.add(IntArray(x) { start }.toMutableList())
    }
    println(matrix)
    return matrix
}

fun createIntList(len : Int, startVal : Int) : MutableList<Int>{
    var list : MutableList<Int> = mutableListOf()
    for (i in 0 ..len-1){
        list.add(startVal)
    }
    return list
}

fun createStringList(len : Int, startVal : String) : MutableList<String>{
    var list : MutableList<String> = mutableListOf()
    for (i in 0 ..len-1){
        list.add(startVal)
    }
    return list
}

fun createLongList(len : Int, startVal : Long) : MutableList<Long>{
    var list : MutableList<Long> = mutableListOf()
    for (i in 0 ..len-1){
        list.add(startVal)
    }
    return list
}
