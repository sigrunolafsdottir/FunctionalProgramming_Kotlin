package AoC.AoC2021.Dec12


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec12Test {

    val data: List<String> = makeStringList("src/AoC/AoC2021/Dec12/input_mini.txt")

    @Test
    fun testA() {
        val answer = Dec12(data).solA()
        println(answer)
        assertTrue(answer == 1)
    }



    @Test
    fun testB() {
        val answer = Dec12(data).solB()
        println(answer)
        assertTrue(answer == 1)
    }


}