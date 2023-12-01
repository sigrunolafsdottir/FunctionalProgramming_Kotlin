package Demos

class GenericHolder<T>(val value: T) {
    fun getTheValue(): T = value
}

fun main() {
    val h2 = GenericHolder(1)
    val i: Int = h2.getTheValue()         // ger 1
    println(i)

    val h3 = GenericHolder("Chartreuse")
    val s: String = h3.getTheValue()      //  ger “Chartreuse”
    println(s)
}
