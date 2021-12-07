package AoC.AoC2021.Dec2


import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec2Test {

    val input = listOf("forward 5",
            "down 5",
            "forward 8",
            "up 3",
            "down 8",
            "forward 2")

    @Test
    fun testA() {
        val answer = Dec2(input).solA()
        assertTrue(answer == 150)
    }

    @Test
    fun testB() {
        val answer = Dec2(input).solB()
        assertTrue(answer == 900)
    }


}