package Övningsuppgifter.ÖvnUppg9_HigherOrderFunctions

import java.util.stream.IntStream

fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {

    var res : MutableList<T> = mutableListOf<T>()
    for (element in this) {
        if (predicate(element))
            res += element
    }
    return res
}



fun main() {
    val ints = listOf(1, 2, -3, 5, -1)
    println( ints.myFilter { it > 0 } )

}