package Demos

private class Triangle (h: Int, w: Int) {
    var h: Int = h
        get() {
            return field
        }
        set(value) {
            field =value
            //field =value + 5
        }
    var w: Int = w
        get() {
            return field
        }
        set(value) {
            field =value
        }

    private fun test2() = "hej"
}

private fun test() = "hej"

fun main(){
    val r = Triangle(3,4)
    println(r.h)
    println(r.w)
    r.h = 5
    println(r.h)
    println(test())
   // println(r.test2())

    //Vi hittar denna, fast den står i en annan fil, för Appartement är publik
    val app = Appartement(5)
    println(app.presentation())
}