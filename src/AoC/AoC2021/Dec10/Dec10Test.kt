package AoC.AoC2021.Dec10


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec10Test {

    val data: List<String> = makeStringList("src/AoC/AoC2021/Dec10/input_mini.txt")

    @Test
    fun testA() {
        val answer = Dec10(data).solA()
        println(answer)
        assertTrue(answer == 26397)
    }



    @Test
    fun testB() {
        val answer = Dec10(data).solB()
        println(answer)
        assertTrue(answer == 288957L)
    }


}