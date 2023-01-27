package FilmKod.Samlingar

val numbers = listOf(3,5,6,4,3,7,8,6,5,9)

val mySet = setOf(3,5,6,4,3,7,8,6,5,9)

val numbersMutable = mutableListOf(3,5,6,4,3,7,8,6,5,9)

val knattar = listOf("Knatte", "Fnatte", "Tjatte")

val myMap = mapOf (1 to "hus", 2 to "bil", 3 to "bord", 4 to "stol")


fun main(){
    numbersMutable.add(4)
    println(numbersMutable)

    println(numbersMutable.sorted())
    println(numbersMutable.reversed())

    println(numbersMutable.take(3))
    println(numbersMutable.takeLast(3))
    println(numbersMutable.subList(1,5))
    println(numbersMutable.slice(1..6))

    println(numbersMutable.sum())
    println(numbersMutable.average())

    println(mySet)

    for ((key, value) in myMap) println("$key $value")

    numbers.forEach{e -> println(e)}

}