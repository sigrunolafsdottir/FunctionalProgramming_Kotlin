package AoC.AoC2021.Dec1

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec1Test {

    val input = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

    @Test
    fun testA() {
        val answer = Dec1(input).solA()
        assertTrue(answer == 7)
    }

    @Test
    fun testA2() {
        val answer = Dec1(input).solA2()
        println(answer)
        assertTrue(answer == 7)
    }

    @Test
    fun testB() {
        val answer = Dec1Windowed(input).solB()
        assertTrue(answer == 5)
    }

    @Test
    fun testB2() {
        val answer = Dec1(input).solB2()
        assertTrue(answer == 5)
    }

    @Test
    fun testAWin() {
        val answer = Dec1Windowed(input).solA()
        assertTrue(answer == 7)
    }

    @Test
    fun testBWin() {
        val answer = Dec1Windowed(input).solB()
        assertTrue(answer == 5)
    }
}