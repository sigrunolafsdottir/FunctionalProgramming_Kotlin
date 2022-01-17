package AoC.AoC2021.Dec2

import AoC.AoC2020.makeMapGroupBy


class Dec2GroupBy(data: Map<String,  List<List<String>>>) {

    val input = data

    fun solA(): Int {
        var Xcounter= input.get("forward")?.map{it.last().toInt()}?.sum()!!
        var downcounter = input.get("down")?.map{it.last().toInt()}?.sum()!!
        var upcounter = input.get("up")?.map{it.last().toInt()}?.sum()!!

        return (Xcounter * (downcounter - upcounter))
    }

}

    fun main(){
        val data: Map<String, List<List<String>>> = makeMapGroupBy("src/AoC/AoC2021/Dec2/input.txt", " ")
        println("Solution A: "+Dec2GroupBy(data).solA())


    }
