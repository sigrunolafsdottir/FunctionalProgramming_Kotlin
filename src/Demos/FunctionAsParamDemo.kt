package Demos

fun main() {
    val list = listOf(1, 2, 3, 4)
    val isEven: (Int) -> Boolean = { e: Int -> e % 2 == 0 }
    val even: List<Int> = list.filter(isEven)
    val even2: Int = list.count(isEven)
    val hasEven: Boolean = list.any(isEven)
    println(even)
    println(even2)
    println(hasEven)
}