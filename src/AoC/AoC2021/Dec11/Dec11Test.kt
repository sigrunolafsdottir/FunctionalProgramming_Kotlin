package AoC.AoC2021.Dec11


import AoC.AoC2020.makeIntListFromConcatenatedString
import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec11Test {

    val data: List<List<Int>> = makeIntListFromConcatenatedString("src/AoC/AoC2021/Dec11/input_mini.txt")

    @Test
    fun testA() {
        val answer = Dec11(data).solA()
        println(answer)
        assertTrue(answer == 204)
        //Alva
    }



    @Test
    fun testB() {
        val answer = Dec11(data).solB()
        println(answer)
        assertTrue(answer == 1)
    }


}