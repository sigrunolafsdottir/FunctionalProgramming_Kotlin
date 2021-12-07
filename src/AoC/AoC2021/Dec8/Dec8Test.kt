package AoC.AoC2021.Dec8


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec8Test {

    val data: List<Int> = makeIntListFromOneString("src/AoC/AoC2021/Dec8/input_mini.txt")

    @Test
    fun testA() {
        val answer = Dec8(data).solA()
        println(answer)
        assertTrue(answer == 1)
    }



    @Test
    fun testB() {
        val answer = Dec8(data).solB()
        println(answer)
        assertTrue(answer == 1)
    }


}