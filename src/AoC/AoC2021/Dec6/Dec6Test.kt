package AoC.AoC2021.Dec6

import AoC.AoC2020.makeIntList
import AoC.AoC2020.makeIntListFromOneString
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec6Test {

    val input: List<Int> = makeIntListFromOneString("src/AoC/AoC2021/Dec6/input_mini.txt")


    @Test
    fun testB() {
        val answer = Dec6(input, 18).solAandB()
        assertTrue(answer == 26L)
    }

    @Test
    fun testB2() {
        val answer = Dec6(input, 80).solAandB()
        println(answer)
        assertTrue(answer == 5934L)
    }

}