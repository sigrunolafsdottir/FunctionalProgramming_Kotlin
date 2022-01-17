package AoC.AoC2021.Dec15


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec15Test {

    val data: List<String> = makeStringList("src/AoC/AoC2021/Dec15/input_mini.txt")

    @Test
    fun testA() {
        val answer = Dec15(data).solA()
        println(answer)
        assertTrue(answer == 1)
    }



    @Test
    fun testB() {
        val answer = Dec15(data).solB()
        println(answer)
        assertTrue(answer == 1)
    }


}