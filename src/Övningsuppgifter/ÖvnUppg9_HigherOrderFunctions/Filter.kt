package Övningsuppgifter.ÖvnUppg9_HigherOrderFunctions

import java.util.stream.IntStream

fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {

    var res : List<T> = listOf<T>()
    for (element in this) {
        if (predicate(element))
            res += element
    }
    return res
}

fun <T>List<T>.filterLetterA(
    predicate: (T) -> Boolean): List<T>{
    val list = mutableListOf<T>()

    for (element in this){
        if(predicate(element)){
            list.add(element)
        }
    }
    return list
}


fun main() {
    val ints = listOf(1, 2, -3, 5, -1)
    println( ints.myFilter { it > 0 } )



}