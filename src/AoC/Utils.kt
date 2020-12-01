package AoC

import java.io.File


//Todo, klura ut hur man gör int-inläsningen på en rad, det måste gå!!!
fun makeListSnyggare(fileName : String) : List<String>
        = File(fileName).useLines { it.toList() }

fun makeList (fileName : String) : List<Int> {
    val intList: MutableList<Int> = mutableListOf()
    val input: List<String> = File(fileName).readLines()
    input.forEach { line -> intList.add(line.trim().toInt()) }
    return intList;
}