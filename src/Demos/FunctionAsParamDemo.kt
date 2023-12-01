package Demos

fun pipetest() : Int {
    val list = listOf(1, 5, 7, 10)
    var sum = 0
    val divider = 5
    list.filter { it % divider == 0 }.forEach { sum += it }     //blir 15
    return (sum)
}

fun main() {

    val list = listOf(1, 2, 3, 4)
    val listString = listOf("a", "b", "c")

    val isEven: (Int) -> Boolean = { e: Int -> e % 2 == 0 }

    val even = list.filter(isEven)
    val even2 = list.count(isEven)
    val hasEven = list.any(isEven)

    //val evens = listString.filter(isEven)

    println(even)
    println(even2)
    println(hasEven)

    println(pipetest())
}