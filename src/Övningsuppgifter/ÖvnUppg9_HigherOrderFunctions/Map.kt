package Övningsuppgifter.ÖvnUppg9_HigherOrderFunctions

fun <T,S> List<T>.myMap(function: (T) -> (S)): List<S> {

    var res : MutableList<S> = mutableListOf<S>()

    for (element in this) {
        res += function(element)
    }
    return res
}

fun main() {
    val ints = listOf(1, 2, -3, 5, -1)
    println( ints.myMap { it + 3 } )
    println( ints.myMap { "[$it aaa]" } )

}