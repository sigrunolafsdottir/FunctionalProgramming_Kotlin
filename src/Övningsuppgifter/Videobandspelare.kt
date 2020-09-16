package Övningsuppgifter

fun main() {

    fun getProgramLengthInMinutes(pStartH: Int, pStartM: Int, pStopH: Int, pStopM: Int): Int {
        val deltaH = pStopH - pStartH
        val deltaM = pStopM - pStartM
        return 60*deltaH + deltaM
    }

    fun lengthLeftInMinutes(fullLen: Int, takenLen: Int): Int {
        return fullLen - takenLen
    }

    fun doesProgramFitOnVideoTape(lenVideo: Int, lenProgram: Int): Boolean {
        return if (lenVideo - lenProgram >= 0) true
        else false
    }

    fun enoughTime(fullLen: Int, takenLen: Int, pStartH: Int, pStartM: Int, pStopH: Int, pStopM: Int): Boolean {
        val pLen = getProgramLengthInMinutes(pStartH, pStartM, pStopH, pStopM)
        val vLen = lengthLeftInMinutes(fullLen, takenLen)
        return doesProgramFitOnVideoTape(vLen, pLen)
    }

    println(enoughTime(90, 30, 20, 0, 20, 30))
    println(enoughTime(90, 30, 20, 45, 21, 15))
    println(enoughTime(90, 30, 20, 30, 21, 15))
    println(enoughTime(90, 30, 20, 15, 21, 30))
    println(enoughTime(90, 80, 20, 0, 20, 30))
}