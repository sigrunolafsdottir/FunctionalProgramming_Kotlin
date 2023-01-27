package FilmKod.FunktionellProgrammering


class Box<T> (var stuff : T){
    fun getMyStuff() : T = stuff
    fun setMyStuff(s: T) { stuff = s}
}

fun <T> List<T>.any (predicate: (T) -> Boolean) : Boolean{
    for (e in this){
        if (predicate(e)) return true
    }
    return false
}

fun main(){
    val b1 = Box(34)
    println(b1.getMyStuff())
    b1.setMyStuff(123)
    println(b1.getMyStuff())

    val b2 = Box("hej")
    println(b2.getMyStuff())

    val myList = listOf(3,4,5,3,4,3,7,9,5)
    println(myList.any{it < 10})
    println(myList.any{it < 0})
}

























