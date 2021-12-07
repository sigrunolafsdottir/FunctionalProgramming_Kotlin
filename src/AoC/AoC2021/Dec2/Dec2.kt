package AoC.AoC2021.Dec2

import AoC.AoC2020.makeIntList
import AoC.AoC2020.makeStringList


class Dec2(data: List<String>) {

        val input = data

        fun solA(): Int {
            var Xcounter: Int = 0
            var ycounter: Int = 0

            for (str in input){
                val instrArray: List<String> = str.split(" ")
                when (instrArray[0]) {
                    "forward" -> Xcounter += instrArray[1].toInt()
                    "down" -> ycounter += instrArray[1].toInt()
                    "up" -> ycounter -= instrArray[1].toInt()
                }
            }


            return Xcounter*ycounter
        }

    fun solB() : Int {

        var Xcounter: Int = 0
        var ycounter: Int = 0
        var aim: Int = 0

        for (str in input){
            val instrArray: List<String> = str.split(" ")
            when (instrArray[0]) {
                "forward" -> {
                    Xcounter += instrArray[1].toInt()
                    ycounter += aim * instrArray[1].toInt()
                }
                "down" -> aim += instrArray[1].toInt()
                "up" -> aim -= instrArray[1].toInt()
            }
        }


        return Xcounter*ycounter
    }
}



    fun main(){
        val data: List<String> = makeStringList("src/AoC/AoC2021/Dec2/input.txt")
        println("Solution A: "+Dec2(data).solA())
        println("Solution B: "+Dec2(data).solB())
    }
