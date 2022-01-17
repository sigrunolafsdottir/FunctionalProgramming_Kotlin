package AoC.AoC2021.Dec14


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeMap
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec14Test {

    val data: Map<String, String> = makeMap("src/AoC/AoC2021/Dec14/input_mini.txt", " -> ")

    @Test
    fun testA() {
        val answer = Dec14(data, "NNCB", 10).solA()
        println(answer)
        assertTrue(answer == 1588L)
    }



    @Test
    fun testB() {
        val answer = Dec14(data, "NNCB", 10).solB()
        println(answer)
        assertTrue(answer == 1)
    }


}