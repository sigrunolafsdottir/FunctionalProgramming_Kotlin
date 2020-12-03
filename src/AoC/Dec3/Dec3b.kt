package AoC.Dec3

import AoC.makeStringList


fun main(){

    val input = makeStringList ("src/AoC/Dec3/input.txt")

    fun countTrees(deltaX : Int, deltaY : Int) : Int {
        var counter : Int = 0
        var x : Int = 0
        val width : Int = input.get(0).length
        val rowNum : Int = input.size -1
        for (y in 0..rowNum-deltaY step deltaY) {     //iter row
            x = (x + deltaX) % width
            if (input.get(y+deltaY).get(x) == '#') counter++
        }
        return counter
    }

    val a = countTrees(1, 1)
    val b = countTrees(3, 1)
    val c = countTrees(5, 1)
    val d = countTrees(7, 1)
    val e = countTrees(1, 2)

    println("a: $a, b: $b, c: $c, d: $d, e: $e")
    val prod : Long = a.toLong()*b.toLong()*c.toLong()*d.toLong()*e.toLong()
    println(prod)

}