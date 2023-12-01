package Demos


fun typeDemo(x: Any) {
    when (x) {
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
        is IntArray -> println(x.sum())
        is List<*> -> println(x.size)
    }
}

fun main() {
    typeDemo("hej")
    typeDemo(5)
    typeDemo(intArrayOf(10, 20, 30, 40, 50))
    typeDemo(listOf(3,4,5))
}