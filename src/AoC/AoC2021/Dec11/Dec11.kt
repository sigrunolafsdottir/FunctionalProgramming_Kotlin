package AoC.AoC2021.Dec11

import AoC.AoC2020.*


class Dec11(data: List<List<Int>>) {

    val input = data
    var paddedInput = padMatrix()
    var flashCounter = 0

    fun padMatrix() : MutableList<MutableList<Int>> {
        //måste finnas ett bättre sätt att kopiera matriser!!!
        var paddedInput = createMatrix(input[0].size, input.size, 0)
        for (i in 0..input.size -1){
            paddedInput[i] = input[i].toMutableList()
        }

        for (i in 0..paddedInput.size-1){
            paddedInput[i].add(0,-100)
            paddedInput[i].add(-100)
        }
        paddedInput.add(0, createIntList(paddedInput[0].size, -100))
        paddedInput.add(createIntList(paddedInput[0].size, -100))
        return paddedInput
    }

    fun resetOuterCircle() : MutableList<MutableList<Int>> {

        for (i in 0..paddedInput.size-1){
            paddedInput[i][0] = -100
            paddedInput[i][paddedInput[0].size-1] = -100
        }
        paddedInput[0] = createIntList(paddedInput[0].size, -100)
        paddedInput[paddedInput.size-1] = createIntList(paddedInput[0].size, -100)
        return paddedInput
    }

    fun increaseOne(){
        for (i in 1..paddedInput[0].size-2){
            for (j in 1..paddedInput.size-2){
                paddedInput[i][j]++

            }
        }
    }

    fun calculateFlash(){

        var hasChanged = true
        while (hasChanged) {

            var workingCopy = createMatrix(paddedInput[0].size, paddedInput.size, 0)
            for (i in 0..paddedInput.size -1){
                workingCopy[i] = paddedInput[i].toMutableList()
            }
            hasChanged = false
            for (i in 1..paddedInput[0].size - 2) {
                for (j in 1..paddedInput.size - 2) {
                    if (paddedInput[i][j] == 10) {   //räkna upp
                        if (workingCopy[i - 1][j - 1] != 10) {
                            workingCopy[i - 1][j - 1]++
                        }
                        if (workingCopy[i - 1][j] != 10) {
                            workingCopy[i - 1][j]++
                        }
                        if (workingCopy[i - 1][j + 1] != 10) {
                            workingCopy[i - 1][j + 1]++
                        }
                        if (workingCopy[i][j - 1] != 10) {
                            workingCopy[i][j - 1]++
                        }
                        workingCopy[i][j]++   //så vi inte flashar samma punkt igen
                        if (workingCopy[i][j + 1] != 10) {
                            workingCopy[i][j + 1]++
                        }
                        if (workingCopy[i + 1][j - 1] != 10) {
                            workingCopy[i + 1][j - 1]++
                        }
                        if (workingCopy[i + 1][j] != 10) {
                            workingCopy[i + 1][j]++
                        }
                        if (workingCopy[i + 1][j + 1] != 10) {
                            workingCopy[i + 1][j + 1]++
                        }
                        hasChanged = true
                    }
                }
                paddedInput = workingCopy

            }
        }
       for (i in 1..paddedInput[0].size-2){
            for (j in 1..paddedInput.size-2){
                if (paddedInput[i][j] > 9){
                    flashCounter++
                    paddedInput[i][j] = 0
                }
            }
        }
        resetOuterCircle()

    }


    fun solA(): Int {
        for (i in 0..300){
            increaseOne()
            calculateFlash()

            val sameVal = 0
            var same = true
            for (j in 1..paddedInput[0].size - 2) {
                for (k in 1..paddedInput.size - 2) {
                    if (sameVal != paddedInput[j][k]) {
                        same = false
                    }
                }
            }
            if (same){
                println( " sync, for B solution, add 1 to "+ i)
                paddedInput.forEach{println(it)}
            }

        }

        return flashCounter;
    }

    fun solB(): Int {

        return 1
    }


}


    fun main(){
        val data: List<List<Int>> = makeIntListFromConcatenatedString("src/AoC/AoC2021/Dec11/input.txt")
        println("Solution A: "+Dec11(data).solA())
    }
