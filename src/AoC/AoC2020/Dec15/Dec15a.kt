package AoC.AoC2020.Dec15

fun main(){

    val input= listOf(5,1,9,18,13,8,0)
    val last = 2020

    fun calc() : Int{
        var resultList : MutableList<Int> = input.toMutableList()

        for (i in resultList.size..last-1){
                val numberToCheck = resultList.last()
                val occurrence = resultList.count { it == numberToCheck }
                when(occurrence) {
                    1 -> resultList.add(0)
                    else -> {
                        val index1 : Int = resultList.lastIndexOf(numberToCheck)
                        val index2 : Int = resultList.dropLast(1).lastIndexOf(numberToCheck)
                        resultList.add(index1 - index2)
                    }
                }
        }
        return resultList.last()
    }

    println(calc())

}