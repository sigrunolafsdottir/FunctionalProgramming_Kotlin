package AoC.AoC2021.Dec1

import AoC.AoC2020.makeIntList
import java.io.File


class Dec1(data: List<Int>){

    val input = data



    fun solA() : Int{
        var counter : Int = 0

        for (i in 0 until input.size-1) {
            if (input.elementAt(i) < input.elementAt(i+1)){
                counter++
            }
        }

        return counter
    }


    fun solB() : Int {

        var counter : Int = 0

        for (i in 0 until input.size-3) {
            var sum1 : Int = input.elementAt(i) + input.elementAt(i+1) + input.elementAt(i+2);
            var sum2 : Int = input.elementAt(i+1) + input.elementAt(i+2) + input.elementAt(i+3);

            if (sum2 > sum1){
                counter++
            }
        }
        return counter
    }

    fun solA2() : Int = (1..input.size-1).count{input[it-1] < input[it]}
    fun solB2() : Int = (1..input.size-3).count{input.slice(it-1..it+1).sum() < input.slice(it..it+2).sum()}
}

fun main(){
    val data: List<Int> = makeIntList("src/AoC/AoC2021/Dec1/input.txt")
    println("Solution A: "+Dec1(data).solA())
    println("Solution A: "+Dec1(data).solA2())
    println("Solution B: "+Dec1(data).solB())
    println("Solution B: "+Dec1(data).solB2())
}
