package AoC.AoC2021.Dec8


import AoC.AoC2020.makeIntListFromOneString
import AoC.AoC2020.makePairList
import AoC.AoC2020.makePairList2
import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec8Test {

    val data: List<Pair<String, String>> = makePairList2("src/AoC/AoC2021/Dec8/input_mini.txt", "|")

    @Test
    fun testA() {
        val answer = Dec8(data).solA()
        println(answer)
        assertTrue(answer == 26)
    }



    @Test
    fun testB() {
        val answer = Dec8(data).solB()
        println(answer)
        assertTrue(answer == 61229)
    }


}