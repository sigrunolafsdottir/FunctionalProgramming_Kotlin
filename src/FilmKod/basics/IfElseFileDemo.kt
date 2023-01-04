package FilmKod.basics


fun comparator1(x: Int, y:Int) = if (x>y) "x är störst" else "y är störst"

fun main(){

    fun comparator2(x: Int, y:Int) = if (x>y) "x är störst" else "y är störst"

    println(comparator1(4,5))
    println(comparator2(44,5))
}