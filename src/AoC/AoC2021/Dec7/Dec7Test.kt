package AoC.AoC2021.Dec7


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec7Test {

    val data: List<Int> = makeIntListFromOneString("src/AoC/AoC2021/Dec7/input_mini.txt")

    @Test
    fun testA() {
        val answer = Dec7(data).solA()
        println(answer)
        assertTrue(answer == 37)
    }



    @Test
    fun testB() {
        val answer = Dec7(data).solB()
        println(answer)
        assertTrue(answer == 168)
    }


}