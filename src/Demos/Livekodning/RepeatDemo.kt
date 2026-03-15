package Demos.Livekodning



fun main(){

    fun myRepeat(times : Int, action: (Int) -> Unit) {
        for ( index in 0 until times) {
            action (index)
        }
    }


    myRepeat(3, { println("$it") })

    myRepeat(5, { i ->  println("$i") })


}