package AoC.AoC2022.Dec2

import AoC.AoC2020.makePairList2
import java.io.File


class Dec2FirstAttempt(data: List<String>) {

    val input = data

    fun solA() : Int{
        var sum : Int = 0

        for (i in 0 until input.size) {
            when (input.get(i)) {
                "A X" -> sum += 1+3 //sten sten  lika
                "A Y" -> sum += 2+6  //sten påse  vann
                "A Z" -> sum += 3+0  //sten sax
                "B X" -> sum += 1+0 //påse sten   vann
                "B Y" -> sum += 2+3  //påse påse  lika
                "B Z" -> sum += 3+6  //påse sax
                "C X" -> sum += 1+6  //sax sten  vann
                "C Y" -> sum += 2+0  //sax påse
                "C Z" -> sum += 3+3  //sax sax  lika
            }
        }

        return sum
    }


    fun solB() : Int{
        var sum : Int = 0

        for (i in 0 until input.size) {
            when (input.get(i)) {
                "A X" -> sum += 3 //sten förlora  sax
                "A Y" -> sum += 4  //sten lika  sten
                "A Z" -> sum += 8  //sten win  påse
                "B X" -> sum += 1 //påse förlora   sten
                "B Y" -> sum += 5  //påse lika  påse
                "B Z" -> sum += 9  //påse win  sax
                "C X" -> sum += 2  //sax förlora  påse
                "C Y" -> sum += 6  //sax lika  sax
                "C Z" -> sum += 7  //sax win  sten
            }
        }

        return sum
    }

}


fun main(){
    val data: List<String> = File("src/AoC/AoC2022/Dec2/input.txt").readLines()
    //val data: List<Pair<String, String>> = makePairList2("src/AoC/AoC2022/Dec2/input.txt")
    println("Solution A: "+ Dec2FirstAttempt(data).solA())
    println("Solution B: "+ Dec2FirstAttempt(data).solB())

}