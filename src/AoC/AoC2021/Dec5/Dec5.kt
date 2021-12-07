package AoC.AoC2021.Dec5

import AoC.AoC2020.createMatrix
import AoC.AoC2020.makeStringList
import java.util.*


class Dec5(data: List<String>, sizeInput: Int) {

    var input = data
    var size = sizeInput
    var matrix = createMatrix(size, size, 0)


    fun isVertical(line :Pair<Pair<Int,Int>,Pair<Int, Int>>)  = line.first.first == line.second.first

    fun isHorizontal(line :Pair<Pair<Int,Int>,Pair<Int, Int>>)  = line.first.second == line.second.second


    fun drawline(line :Pair<Pair<Int,Int>, Pair<Int, Int>> , diagonals : Boolean ) {
        if (isHorizontal(line)){   // ex: (2,4) -> (5, 4)
            if( line.first.first <= line.second.first ){   //vi itererar framlänges
                for (i: Int in line.first.first..line.second.first ){
                    matrix[line.first.second][i]++ //
                }
            }else{    // ex: (5,4) -> (2, 4)
                for (i: Int in line.second.first..line.first.first ){   //vi itererar baklänges
                    matrix[line.first.second][i]++
                }
            }
        }

        else if (isVertical(line)){  // ex: (2,1) -> (2, 3)
            if( line.first.second <= line.second.second ){   //vi itererar framlänges
                for (i: Int in line.first.second..line.second.second ){
                    matrix[i][line.first.first]++
                }
            }else{    // ex: (2,2) -> (2, 1)
                for (i: Int in line.second.second .. line.first.second){    //vi itererar baklänges
                    matrix[i][line.first.first]++
                }
            }
        }

        else if (diagonals ){   // ex: (1,1) -> (4,4)
            if(line.first.first <= line.second.first && line.first.second <= line.second.second ){
                var x = line.first.first
                var y = line.first.second
                for (i: Int in line.first.first .. line.second.first){    //vi itererar framlånges över x
                    matrix[y][x]++
                    x++
                    y++
                }
            }
            // ex: (6,4) -> (2,0)
            else if(line.second.first <= line.first.first && line.second.second <= line.first.second  ){
                var x = line.second.first
                var y = line.second.second
                for (i: Int in line.second.first .. line.first.first){
                    matrix[y][x]++
                    x++
                    y++
                }
            }
            // ex: (5,5) -> (8,2)
            else if(line.second.second <= line.first.second && line.second.first >= line.first.first ){
                var x = line.first.first
                var y = line.first.second
                for (i: Int in line.first.first .. line.second.first){    //vi itererar framlånges över x
                    matrix[y][x]++
                    x++
                    y--
                }
            }
        // ex: (4,0) -> (0,4)
            else if(line.first.second <= line.second.second && line.first.first >= line.second.first ){
                var x = line.second.first
                var y = line.second.second
                for (i: Int in line.second.first .. line.first.first){    //vi itererar baklänges över x
                    matrix[y][x]++
                    x++
                    y--
                }
            }
        }

    }

    fun doAssignment(includeDiagonals : Boolean) : Int {

        for (s in input){
            var points = s.split(" -> ")
            var line = Pair(
                Pair(points[0].split(",").map{it.toInt()}.first(), points[0].split(",").map{it.toInt()}.last()),
                Pair(points[1].split(",").map{it.toInt()}.first(), points[1].split(",").map{it.toInt()}.last()))

            drawline(line, includeDiagonals)
        }

        return matrix.sumBy { it.filter {it > 1}.count() }
    }


    fun solA() = doAssignment(false)
    fun solB() = doAssignment(true)

}


    fun main(){
        val data: List<String> = makeStringList("src/AoC/AoC2021/Dec5/input.txt")
        println("Solution A: "+Dec5(data, 1000).solA())
        println("Solution B: "+Dec5(data, 1000).solB())
    }
