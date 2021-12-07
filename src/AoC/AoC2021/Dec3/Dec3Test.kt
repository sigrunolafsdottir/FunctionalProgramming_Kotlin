package AoC.AoC2021.Dec3


import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec3Test {

    val data: List<String> = makeStringList("src/AoC/AoC2021/Dec3/input_mini.txt")

    @Test
    fun testA() {
        val answer = Dec3(data).solA()
        println(answer)
        assertTrue(answer == 198)
    }

    @Test
    fun testB() {
        val answer = Dec3(data).solB()
        println(answer)
        assertTrue(answer == 230)
    }


}