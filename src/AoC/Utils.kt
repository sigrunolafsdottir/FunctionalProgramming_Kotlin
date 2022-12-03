package AoC.AoC2020

import java.io.File


fun makeIntList (fileName : String) = File(fileName).readLines().map{it.toInt()}

fun makeIntListFromOneString (fileName : String) = File(fileName).readLines().get(0).split(",").map{it.toInt()}

fun makeIntListFromConcatenatedString(fileName : String)  = File(fileName).readLines().map { it.toList().map { Character.getNumericValue(it) } }

fun makeIntListFromBinary (fileName : String) = File(fileName).readLines().map{it.toInt(2)}

fun makePairList (fileName : String) = File(fileName).readLines().map{Pair(it.split(" ").first(), it.split(" ").last().toInt()) }
fun makePairList2 (fileName : String, delimiter: String) = File(fileName).readLines().map{Pair(it.split(delimiter).first().trim(), it.split(delimiter).last().trim()) }
fun makePairList3 (fileName : String, delimiter: String) = File(fileName).readLines().map{Pair(it.split(delimiter).first().trim().toInt(), it.split(delimiter).last().trim().toInt()) }

fun makePairList4 (fileName : String) = File(fileName).readLines().map{Pair(it.substring(0, it.length/2), it.substring(it.length/2)) }

fun makeMap (fileName : String, delimiter: String) = File(fileName).readLines().map { it.split(delimiter) }.associate { (a, b) -> a to b }
fun makeMapGroupBy (fileName : String, delimiter: String) = File(fileName).readLines().map { it.split(delimiter) }.groupBy { it.first() }


fun makeLongList (fileName : String) = File(fileName).readLines().map{it.toLong()}

fun makeStringList (fileName : String) = File(fileName).readLines()



fun createMatrix(x : Int, y : Int, start : Int) : MutableList<MutableList<Int>>{
    var matrix : MutableList<MutableList<Int>> = mutableListOf()
    for (i in 0 ..y-1){
        matrix.add(IntArray(x) { start }.toMutableList())
    }
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


