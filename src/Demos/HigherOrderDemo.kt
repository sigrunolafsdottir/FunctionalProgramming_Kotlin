package Demos

fun repeat(
    times: Int,
    action: (Int) -> Unit
) {
    for (index in 0 until times) {
        action(index)
    }
}


var funktionVar:  (Int) -> Unit =  {i -> println("#$i")}

fun funktionNoVar (i : Int): Unit =  println("#$i")

fun main() {
    repeat(3) { println("#$it") }   //skriver ut  #0 #1 #2
    repeat (3, funktionVar)
    repeat (3, ::funktionNoVar)
}

