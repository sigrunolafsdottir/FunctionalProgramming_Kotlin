package AoC.AoC2021.Dec4


import AoC.AoC2020.makeStringList
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Dec4Test {

    val data: List<String> = makeStringList("src/AoC/AoC2021/Dec4/input_mini.txt")

    @Test
    fun testMatrix(){
        val matrix = Dec4(data).createMatrix()
        println("matrix: " +matrix)
        assertTrue(matrix[0].size == 25)
        assertTrue(matrix.size == 3)
        assertTrue(matrix[0][0] == 22)
    }

    @Test
    fun testA() {
        val answer = Dec4(data).solA()
        println(answer)
        assertTrue(answer == 4512)
    }

    @Test
    fun testB() {
        val answer = Dec4(data).solB()
        println(answer)
        assertTrue(answer == 1924)
    }


}