package Demos

class Appartement (rooms : Int) {
    var temp: String = "hej"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var rooms: Int = rooms
        get() {
            return field
        }
        set(value) {
          field = value
        }

    fun presentation() = println("jag har $rooms $temp")
}

fun main(){
    var h = Appartement(5)
    println(h.rooms)
    h.rooms = 4
    println(h.rooms)
    h.presentation()

    println(h.temp)
    h.temp = "nåt annat"
    println(h.temp)


}