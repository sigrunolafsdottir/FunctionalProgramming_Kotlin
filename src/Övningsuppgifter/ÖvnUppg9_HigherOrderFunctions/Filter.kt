package Övningsuppgifter.ÖvnUppg9_HigherOrderFunctions

fun <T> List<T>.myFilter(
    predicate: (T) -> Boolean
): List<T> {
    var list : List<T> = listOf<T>()
    for (element in this) {
        if (predicate(element))
            list += element
    }
    return list
}

fun main() {
    val ints = listOf(1, 2, -3, 5, -1)
    println( ints.myMap { it + 3 } )

}