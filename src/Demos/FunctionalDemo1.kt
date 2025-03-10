package Demos

fun unitFun() :Unit = Unit

fun main() {
    // Inte tillåtet eftersom "for is a statement, not an expression"
    //val f= for(i in 1..10) {println(i)}

    println(unitFun())
    val i : Int = 4+5
    println(i)
    println()
    val u1: Unit = println(42)   //42
    println(u1)
    println()
    val u2 = println(0) // Type inference
    println(u2)

}
