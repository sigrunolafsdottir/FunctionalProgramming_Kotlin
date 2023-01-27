package FilmKod.KlasserMedMera

data class Angle (val grader:Int)

fun main(){

    var v1 = Angle(45)
    var v2 = Angle(45)
    var v3 = Angle(90)

    println(v1.equals(v2))
    println(v3.equals(v2))

}
