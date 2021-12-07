package AoC.AoC2020.Dec12

import java.io.File

fun main(){

    val input: List<String> = File("src/AoC/Dec12/input.txt").readLines()
    var face : Int = 1    //1 = E, 2 = S, 3 = W, 0 = N
    var (x, y) = Pair(0,0)

    fun getNumber(input : String) : Int =  input.substring(1).toInt()

    fun goBoat(){
        for (instr in input){
            val distance = getNumber(instr)
            when(instr.first()){
                'N' -> y = y + distance
                'S' -> y = y - distance
                'E' -> x = x + distance
                'W' -> x = x - distance
                'L' -> face = (4 + face - (distance / 90)) % 4  //keeping things positive
                'R' -> face = (face + (distance / 90)) % 4
                'F' -> {
                    when (face) {
                        0 -> y = y + distance  //facing north
                        1 -> x = x + distance  //facing east
                        2 -> y = y - distance  //facing south
                        3 -> x = x - distance  //facing west
                    }
                }
            }
        }
    }

    goBoat()
    println("$x  $y   ${Math.abs(x)+Math.abs(y)}")



}