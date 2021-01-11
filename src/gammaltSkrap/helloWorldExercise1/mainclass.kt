package gammaltSkrap.helloWorldExercise1


fun unitFun1() = Unit
fun unitFun2() = 66
fun unitFun3() = println(88)

fun main() {
    println(unitFun1())  //((Kotlin.Unit))
    println(unitFun2())  //66
    val u1: Unit = println(42)
    println(u1)    //((Kotlin.Unit))
    val u2 = println(0) // Type inference
    println(u2)    //((Kotlin.Unit))
    unitFun3()
}



