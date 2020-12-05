package AoC.Dec4

import AoC.makeStringList

fun main(){

    val input = makeStringList ("src/AoC/Dec4/input.txt")

    fun assembleData(rawInput : List<String>) : List<String> {
        var result: MutableList<String> = mutableListOf()
        var temp: String = ""
        var first: Boolean = true

        for (i in rawInput) {
            if (i.equals("")) {
                result.add(temp)
                temp = ""
                first = true
            } else {
                temp += if(!first) " " + i else i
                first = false
            }
        }
        result.add(temp)
        return result
    }

    fun checkOk (cleanInput : List<String>) : List<String> =
        cleanInput.filter{it.count{it == ':'} == 8
                || (it.count{it == ':'} == 7 && !it.contains("cid:"))}

    println(checkOk(assembleData(input)).size)
}