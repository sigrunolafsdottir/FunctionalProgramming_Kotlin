package Demos

fun unitFun() :Unit = Unit

fun main() {
    println(unitFun())
    val u1: Unit = println(42)
    println(u1)
    val u2 = println(0) // Type inference
    println(u2)
}
