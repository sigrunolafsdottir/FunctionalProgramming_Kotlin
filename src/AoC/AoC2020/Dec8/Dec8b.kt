package AoC.AoC2020.Dec8

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

        try {
            while (!executedRows.contains(execIndex)) {
                when (program.get(execIndex).command) {
                    "nop" -> {
                        executedRows.add(execIndex)
                        execIndex++
                    }
                    "acc" -> {
                        accumulator += program.get(execIndex).nr
                        executedRows.add(execIndex)
                        execIndex++
                    }
                    "jmp" -> {
                        executedRows.add(execIndex)
                        execIndex += program.get(execIndex).nr
                    }
                }
            }
        }
        catch (e : IndexOutOfBoundsException){
            println("IndexOutOfBounds, acc: $accumulator")
        }
        return accumulator
    }

    fun swap(instr : Instruction) : Instruction{
        return if (instr.command.equals("nop"))  Instruction("jmp", instr.nr)
        else Instruction("nop", instr.nr)
    }

    fun swaporganizer(program : List<Instruction>){
        var copyprogram : MutableList<Instruction> = program.toMutableList()

        for ((i, item) in program.withIndex()){
            if (item.command.equals("nop") || item.command.equals("jmp")) {
                copyprogram.set(i, swap(copyprogram.get(i)))
                runProgram(copyprogram)
                copyprogram.set(i, swap(copyprogram.get(i)))
            }
        }
    }

   // println(createList(input))
   // println(runProgram(createList(input)))
        swaporganizer(createList(input))


}