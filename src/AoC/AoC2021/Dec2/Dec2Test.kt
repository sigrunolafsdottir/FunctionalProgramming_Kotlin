package AoC.AoC2021.Dec2


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makePairList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec2Test {

    val input = listOf(Pair("forward", 5),
        Pair("down", 5),
            Pair("forward", 8),
                Pair("up", 3),
                    Pair("down", 8),
                        Pair("forward", 2))


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