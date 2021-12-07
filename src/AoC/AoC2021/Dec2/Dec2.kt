package AoC.AoC2021.Dec2

import AoC.AoC2020.makePairList
import AoC.AoC2020.makeStringList


class Dec2(data: List<Pair<String, Int>>) {

    val inputPair = data

    fun solA(): Int {
        var Xcounter: Int = 0
        var ycounter: Int = 0

        for (p in inputPair) {
            when (p.first) {
                "forward" -> Xcounter += p.second
                "down" -> ycounter += p.second
                "up" -> ycounter -= p.second
            }
        }

        return Xcounter * ycounter
    }

    fun solA2(): Int {
        return inputPair.filter { it.first.equals("forward") }.map { it.second }.sum() *
                (inputPair.filter { it.first.equals("down") }.map { it.second }.sum()
                        - inputPair.filter { it.first.equals("up") }.map { it.second }.sum())

    }


    fun solB(): Int {

        var Xcounter = 0
        var ycounter = 0
        var aim = 0

        for (p in inputPair) {
            when (p.first) {
                "forward" -> {
                    Xcounter += p.second
                    ycounter += aim * p.second
                }
                "down" -> aim += p.second
                "up" -> aim -= p.second
            }
        }

        return Xcounter * ycounter
    }

}

    fun main(){
        val data: List<Pair<String, Int>> = makePairList("src/AoC/AoC2021/Dec2/input.txt")
        println("Solution A: "+Dec2(data).solA())
        println("Solution A: "+Dec2(data).solA2())
        println("Solution B: "+Dec2(data).solB())
    }
