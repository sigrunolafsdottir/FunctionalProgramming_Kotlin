package FilmKod.KlasserMedMera.GreenestDemo


interface feedable{
    fun feedMe() : Double
}

abstract class Plant (var height:Double, val name: String, val ft:FoodType) : feedable

class Palmtree (height:Double, name: String, ft:FoodType) : Plant (height, name, ft){
    override fun feedMe() = 0.5 * height
}

class CarnivorousPlant (height:Double, name: String, ft:FoodType) : Plant (height, name, ft){
    override fun feedMe() = 0.1 + 0.2 * height
}

class Cactus (height:Double, name: String, ft:FoodType) : Plant (height, name, ft){
    override fun feedMe() = 0.2
}

enum class FoodType (val niceName : String){
    PROTEINDRYCK("proteindryck"),
    MINERALVATTEN("mineralvatten"),
    KRANVATTEN("kranvatten")
}


val laura = Palmtree(500.0, "Laura", FoodType.KRANVATTEN)
val iggy = Cactus(20.0, "Iggy", FoodType.MINERALVATTEN)
val putte = Palmtree(100.0, "Putte", FoodType.KRANVATTEN)
val meatloaf = CarnivorousPlant(70.0, "Meatloaf", FoodType.PROTEINDRYCK)

val plantList = listOf(laura, iggy, putte, meatloaf)

fun main(){
    while(true){
        println("Vilken växt ska få mat?")
        val input = readLine()
        val plant = plantList.filter{p -> p.name.equals(input)}.firstOrNull()
        if (plant != null){
            println("${plant.name} ska få ${plant.feedMe()}  ${plant.ft.niceName}")
        }
    }
}

