package Demos

fun <T> List<T>.myAny ( pred: (T) -> Boolean): Boolean {
    for (element in this) {   //this refererear till current object of List<T>
        if (pred(element))
            return true
    }
    return false
}

fun List<Int>.myAny1( predicate: (Int) -> Boolean): Boolean {
    for (element in this) {
        if (predicate(element))
            return true
    }
    return false
}


fun main() {
    val ints = listOf(1, 2, 3, -2)
    println( ints.myAny { i ->  i < 0 } )
    println( ints.myAny { it < 0 } )
}
