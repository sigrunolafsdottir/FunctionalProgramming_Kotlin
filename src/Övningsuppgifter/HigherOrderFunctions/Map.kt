package Övningsuppgifter.HigherOrderFunctions

fun <T> List<T>.myMap(
    function: (T) -> (T)
): List<T> {
    var list : List<T> = listOf<T>()
    for (element in this) {
        list += function(element)
    }
    return list
}

fun main() {
    val ints = listOf(1, 2, -3, 5, -1)
    println( ints.myMap { it + 3 } )

}