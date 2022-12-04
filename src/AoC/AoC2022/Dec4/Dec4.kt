package AoC.AoC2022.Dec4

import AoC.AoC2020.makePairList2


class Dec4(data: List<Pair<String, String>>) {

    val input = data

    //skapar en lista av par bestående av vardera rangen
    fun createRangePairs() : List<Pair<IntRange, IntRange>> {
        return input.map{Pair(it.first.split("-").first().toInt() .. it.first.split("-").last().toInt(),
            it.second.split("-").first().toInt() .. it.second.split("-").last().toInt())}
    }

    fun solA() = createRangePairs().filter{it.first.intersect(it.second).size == it.first.toSet().size
                || it.first.intersect(it.second).size == it.second.toSet().size}.count()

    fun solB() = createRangePairs().filter{it.first.intersect(it.second).size > 0}.count()
}


fun main(){
    val data: List<Pair<String, String>> = makePairList2 ("src/AoC/AoC2022/Dec4/input.txt", ",")
    println("Solution A: "+ Dec4(data).solA())
    println("Solution B: "+ Dec4(data).solB())

}