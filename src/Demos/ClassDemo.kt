package Demos

class House () {
    var rooms: Int = 3
        get() {
            return field
        }
        set(value) {
          field = value
        }
    var isRadhus: Boolean = true
        get() {
            return field
        }
        set(value) {
            field = value
        }

    fun presentation() = println("jag har $rooms")
}

fun main(){
    var h = House()
    println(h.rooms)
    h.rooms = 4
    println(h.rooms)
    println(h.isRadhus)
    h.isRadhus = false
    println(h.isRadhus)

    h.presentation()
}