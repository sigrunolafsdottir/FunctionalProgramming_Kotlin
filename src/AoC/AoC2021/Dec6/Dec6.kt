package AoC.AoC2021.Dec6



import AoC.AoC2020.createLongList
import AoC.AoC2020.makeIntListFromOneString
import java.util.*


class Dec6(data: List<Int>, iterations : Int){

    var input = data
    val iter = iterations


    fun solAandB() : Long {

        var list = createLongList(9, 0L)

        input.forEach{e -> list[e]++}

        for (i in 0..iter-1) {
            Collections.rotate(list, -1)  //flytta alla värden ett steg åt vänster
            list[6] += list[8]
        }

        return list.sum()

    }
}

fun main(){
    val data: List<Int> = makeIntListFromOneString("src/AoC/AoC2021/Dec6/input.txt")
    println("Solution A: "+Dec6(data, 80).solAandB())
    println("Solution B: "+Dec6(data, 256).solAandB())
}
