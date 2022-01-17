package AoC.AoC2021.Dec14

import AoC.AoC2020.createMatrix
import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeMap
import AoC.AoC2020.makeStringList


class Dec14(data: Map<String, String>, startStr: String, steps: Int) {

    val input = data
    val steps = steps
    val start = startStr

    fun solA(): Long {

        var workingString = start
        var tempString = workingString
        for (i in 0..steps-1){
            println(i)
            for (j in 0..workingString.length-2){
                val win = workingString.substring(j, j+2)
                tempString = tempString.substring(0,(j*2)+1) + input.get(win) + tempString.substring((j*2)+1)
            }
            workingString = tempString
        }
        //skapar Map med varje bokstav och dess frekvens
        val frequencyMap : Map<Char, Long> = workingString.toCharArray().groupBy{ it }
            .mapValues { (_, value) -> value.size.toLong() }
        println(frequencyMap)
        var max = 0L
        var min = Long.MAX_VALUE
        for (i in frequencyMap){
            if (i.value > max) max =i.value
            if (i.value < min) min =i.value
        }


        return max - min
    }



    fun solB(): Int {return 1}

}


    fun main(){
        val data: Map<String, String> = makeMap("src/AoC/AoC2021/Dec14/input.txt", " -> ")
        //println("Solution A: "+Dec14(data, "SVKVKCCBNHNSOSCCOPOC", 10).solA())
        println("Solution B: "+Dec14(data, "SVKVKCCBNHNSOSCCOPOC", 40).solA())

    }
