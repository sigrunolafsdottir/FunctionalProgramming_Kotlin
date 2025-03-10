package Demos

fun main() {

    data class Person(
        val name: String,
        val age: Int
    )

    val names = listOf(
        "Alice", "Arthricia", "Bob", "Bill", "Birdperson", "Charlie",
        "Crocubot", "Franz", "Revolio"
    )

    val ages = listOf(21, 15, 25, 25, 42, 21, 42, 21, 33, 56, 34, 45)

    fun people(): List<Person> =
        names.zip(ages) { name, age ->
            Person(name, age)
        }

    fun people2(): List<String> =
        names.zip(ages) { name, age ->
            name+age
        }

    println(people())
    println(people2())
    println()

//Åldern blir nyckel, Person-objekten värden
    val groupMap: Map<Int, List<Person>> =
        people().groupBy(Person::age)

    println(groupMap)
    println()

    //Person-objektet blir nyckel, namnet blir värde
    val AWMap: Map<Person, Int> =
        people().associateWith { it.age }

    println(AWMap)
    println()

    //Namnet bir nyckel, PersonObjektet värde
    val ABMap: Map<String, Person> =
        people().associateBy { it.name }

    println(ABMap)
    println()

    val ABMap2: Map<Int, Person> =
        people().associateBy { it.age }

    println(ABMap2)
println()
    //-------------------------

    val map = mapOf(
        1 to "one",
        2 to "two", 3 to "three", 4 to "four"
    )

    println(map)
    map.forEach {(k,v) -> print(k); v.forEach { print(it) } }

    println(map.filterKeys { it % 2 == 1 } )

    println(map.filterValues { it.contains('o') } )

    println(map.filter { entry ->
        entry.key % 2 == 1 &&
                entry.value.contains('o')
    })

    println(map.filter {
        it.key % 2 == 1 && it.value.contains('o')
    })




    println()
    //--------------------------

    val even = mapOf(2 to "two", 4 to "four")

    println(even.map {"${it.key}=${it.value}" })

    println(even.map { (key, value) -> "$key=$value"})

    println(even.mapKeys { (num, _) -> -num }.mapValues { (_, str) -> "minus $str" }    )

    println(even.map { (key, value) -> -key to "minus $value"}.toMap())

//---------------------

    val map2 = mapOf(1 to "one",
        -2 to "minus two")
    println(map2.any { (key, _) -> key < 0 } )  // true pga -2
    println(map2.all { (key, _) -> key < 0 }  ) // false pga 1
    println(map2.maxByOrNull { it.key }) // “one”, hittar max

}
