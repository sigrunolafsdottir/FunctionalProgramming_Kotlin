package AoC.AoC2020.Dec12

import java.io.File

//Inte riktigt rätt, 26233 är för högt

fun main(){

    val input: List<String> = File("src/AoC/Dec12/input_mini.txt").readLines()
    var (x, y) = Pair(0,0)
    var (wx, wy) = Pair(10,1)

    fun getNumber(input : String) : Int =  input.substring(1).toInt()

    fun goBoat(){
        for (instr in input){
            val distance = getNumber(instr)
            //println(instr.first())
            //println(getNumber(instr))
            when(instr.first()){
                'N' -> wy = wy + distance
                'S' -> wy = wy - distance
                'E' -> wx = wx + distance
                'W' -> wx = wx - distance
                'L' -> {
                    when (distance) {
                        90 -> {
                            val temp = wx
                            wx = -wy
                            wy = temp
                        }
                        180 -> {
                            val temp = wx
                            wx = -wy
                            wy = -temp
                        }
                        270 -> {
                            val temp = wx
                            wx = wy
                            wy = -temp
                        }
                    }
                }
                'R' -> {
                    when (distance) {
                        90 -> {
                            val temp = wx
                            wx = wy
                            wy = -temp
                        }
                        180 -> {
                            val temp = wx
                            wx = -wy
                            wy = -temp
                        }
                        270 -> {
                            val temp = wx
                            wx = -wy
                            wy = temp
                        }
                    }
                }
                'F' -> {
                        x += wx * distance
                        y += wy * distance
                }
            }

            println("$x  $y $wx  $wy  ${Math.abs(x)+Math.abs(y)}")
        }
    }

    goBoat()
    println("$x  $y $wx  $wy  ${Math.abs(x)+Math.abs(y)}")



}