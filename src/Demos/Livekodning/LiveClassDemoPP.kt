package Demos.Livekodning


data class Food( val name : String = "Clementin", var nutrition: Int = 100, val secretNumber: Int = 500 )


fun main(){
    val food1 = Food("Apelsin", 53, 300)
    val food3 = Food("Apelsin", 53, 300)
    val food4 = Food("Nektarin", 60, 100)

    println(food1.equals(food3))
    println(food1.equals(food4))

    println(food1.nutrition)
    println(food1.name)

    food1.nutrition = 30
    println(food1.nutrition)

    val food2 = Food()
    println(food2.nutrition)
    println(food2.name)

}