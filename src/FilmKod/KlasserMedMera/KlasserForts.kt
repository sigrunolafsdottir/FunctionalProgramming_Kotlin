package FilmKod.KlasserMedMera


sealed interface feedable{
    fun feedMe() = 0.2
}

sealed class Plant (var height:Double, val name: String, val ft:FoodType) : feedable

class Palmtree (height:Double, name: String, ft:FoodType = FoodType.KRANVATTEN) : Plant (height, name, ft){
    override fun feedMe() = 0.5 * height
}

class CarnivorousPlant (height:Double, name: String, ft:FoodType) : Plant (height, name, ft){
    override fun feedMe() = 0.1 + 0.2 * height
}

class Cactus (height:Double, name: String, ft:FoodType) : Plant (height, name, ft)

enum class FoodType (val niceName : String){
    PROTEINDRYCK("proteindryck"),
    MINERALVATTEN("mineralvatten"),
    KRANVATTEN("kranvatten")
}


val laura = Palmtree(500.0, "Laura")
val iggy = Cactus( name = "Iggy", height = 20.0, ft = FoodType.MINERALVATTEN)
val putte = Palmtree(100.0, "Putte", FoodType.MINERALVATTEN)
val meatloaf = CarnivorousPlant(70.0, "Meatloaf", FoodType.PROTEINDRYCK)

val plantList = listOf(laura, iggy, putte, meatloaf)

data class Vinkel (val grader:Int)

fun main(){

    var v1 = Vinkel(45)
    var v2 = Vinkel(45)
    var v3 = Vinkel(90)

    println(v1.equals(v2))
    println(v3.equals(v2))


    while(true){
        println("Vilken växt ska få mat?")
        val input = readLine()
        val plant = plantList.filter{p -> p.name.equals(input)}.firstOrNull()
        if (plant != null){
            println("${plant.name} ska få ${plant.feedMe()}  ${plant.ft.niceName}")
        }
    }

}

