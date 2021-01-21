package Demos

class GenericHolder<T>(private val value: T) {
    fun getValue(): T = value
}

fun main() {
    val h2 = GenericHolder(1)
    val i: Int = h2.getValue()         // ger i
    println(i)

    val h3 = GenericHolder("Chartreuse")
    val s: String = h3.getValue()      //  ger “Chartreuse”
    println(s)
}
