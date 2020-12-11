package AoC.Dec8

import java.io.File

fun main(){

    val input: List<String> = File("src/AoC/Dec8/input.txt").readLines()

    data class Instruction(val command: String, val nr : Int)

    fun createList(initialInput : List<String>) : List<Instruction> {

        var program : List<Instruction> = listOf()
        for (i in initialInput){
            val fields = i.split(" ")
            program += Instruction(fields[0], fields[1].toInt())
        }
        return program
    }

    fun runProgram(program : List<Instruction>) : Int{
        var accumulator : Int = 0
        var execIndex : Int = 0
        var executedRows : MutableList<Int> = mutableListOf()
        //var uniqueRow: Boolean = true

        while (!executedRows.contains(execIndex)){
            when(program.get(execIndex).command ){
                "nop" -> {
                    executedRows.add(execIndex)
                    execIndex++
                }
                "acc" -> {
                    accumulator += program.get(execIndex).nr
                    executedRows.add(execIndex)
                    execIndex ++
                }
                "jmp" -> {
                    executedRows.add(execIndex)
                    execIndex += program.get(execIndex).nr
                }
            }
        }
        return accumulator
    }

    println(createList(input))
    println(runProgram(createList(input)))




}