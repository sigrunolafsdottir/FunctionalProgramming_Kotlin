package Demos

fun <T> List<T>.any(
    predicate: (T) -> Boolean
): Boolean {
    for (element in this) {
        if (predicate(element))
            return true
    }
    return false
}

fun main() {
    val ints = listOf(1, 2, 3)
    println( ints.any { it < 0 } )
}
