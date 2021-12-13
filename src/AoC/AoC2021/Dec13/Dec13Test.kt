package AoC.AoC2021.Dec13


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makePairList3
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec13Test {

    val data: List<Pair<Int, Int>> = makePairList3("src/AoC/AoC2021/Dec13/input_mini.txt", ",")
    val data_mini2: List<Pair<Int, Int>> = makePairList3("src/AoC/AoC2021/Dec13/input_mini2.txt", ",")
    val foldsY : List<Pair<Char, Int>> = listOf(Pair('x', 5))
    val foldsX : List<Pair<Char, Int>> = listOf(Pair('y', 7))
    val folds : List<Pair<Char, Int>> = listOf(Pair('y', 7), Pair('x', 5))

    @Test
    fun testA() {
        val answer = Dec13(data_mini2, foldsY).solve()
        println(answer)
        assertTrue(answer == 16)
    }

    @Test
    fun testA2() {
        val answer = Dec13(data, foldsX).solve()
        println(answer)
        assertTrue(answer == 1)
    }



    @Test
    fun testB() {
        val answer = Dec13(data, folds).solve()
        println(answer)
        assertTrue(answer == 1)
    }


}