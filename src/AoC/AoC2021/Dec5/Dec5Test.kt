package AoC.AoC2021.Dec5


import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec5Test {

    val data: List<String> = makeStringList("src/AoC/AoC2021/Dec5/input_mini.txt")
    val straightLine1 = Pair(Pair(3,4), Pair (7,4))  //horizontal
    val straightLine2 = Pair(Pair(3,7), Pair (3,4))   //vertical
    val notStraightLine = Pair(Pair(1,2), Pair (3,4))


    @Test
    fun testHorizontal() {
        val answer1 = Dec5(data, 10).isHorizontal(straightLine1)
        val answer2 = Dec5(data, 10).isHorizontal(straightLine2)
        assertTrue(answer1)
        assertFalse(answer2)
    }

    @Test
    fun testVertical() {
        val answer1 = Dec5(data, 10).isVertical(straightLine1)
        val answer2 = Dec5(data, 10).isVertical(straightLine2)
        assertFalse(answer1)
        assertTrue(answer2)
    }

    @Test
    fun testA() {
        val answer = Dec5(data, 10).solA()
        println(answer)
        assertTrue(answer == 5)
    }

    @Test
    fun testB() {
        val answer = Dec5(data, 10).solB()
        println(answer)
        assertTrue(answer == 12)
    }


}