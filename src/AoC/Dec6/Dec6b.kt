package AoC.Dec6

import AoC.makeStringList


fun main() {
    val input = makeStringList("src/AoC/Dec6/input_mini.txt")

    fun assembleData(rawInput: List<String>): List<List<String>> {
        var result: MutableList<MutableList<String>> = mutableListOf()
        var temp: MutableList<String> = mutableListOf()

        for (i in rawInput) {
            if (i.equals("")) {
                result.add(temp)
                temp = mutableListOf()
            } else {
                    temp.add(i)
            }
        }
        result.add(temp)
        return result
    }

    //todo: bryt ner strängarna i char-arrayer och intersecta chararna
    //funkar inte som den är nu
   // fun reduce(sets : List<List<String>>) : Int{
    //    return sets.map { it.reduce(List<String>::intersect).size }.sum()
    //}

    println(assembleData(input))
   // println(reduce(assembleData(input)))

}