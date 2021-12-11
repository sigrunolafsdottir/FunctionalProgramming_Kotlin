package AoC.AoC2021.Dec9


import AoC.AoC2020.makeIntListFromConcatenatedString
import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec9Test {

    val data: List<List<Int>> = makeIntListFromConcatenatedString("src/AoC/AoC2021/Dec9/input_mini.txt")

    @Test
    fun testA() {
        val answer = Dec9(data).solA()
        println(answer)
        assertTrue(answer == 15)
    }



    @Test
    fun testB() {
        val answer = Dec9(data).solB()
        println(answer)
        assertTrue(answer == 1134)
    }


}