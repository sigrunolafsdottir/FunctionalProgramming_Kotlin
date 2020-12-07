package AoC.Dec6

import AoC.makeStringList

fun main() {
    val input = makeStringList("src/AoC/Dec6/input.txt")

    fun assembleData(rawInput: List<String>): List<Set<Char>> {
        var result: MutableList<MutableSet<Char>> = mutableListOf()
        var temp: MutableSet<Char> = mutableSetOf()

        for (i in rawInput) {
            if (i.equals("")) {
                result.add(temp)
                temp = mutableSetOf()
            } else {
                for (j in i){
                    temp.add(j)
                }
            }
        }
        result.add(temp)
        return result
    }

    fun reduce(sets : List<Set<Char>>) : Int =  sets.map{it.size}.sum()


    println(assembleData(input))
    println(reduce(assembleData(input)))

}