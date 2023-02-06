package FilmKod.FunktionellProgrammering

class Person(val name: String, val age: Int, val street: String, val city: String)

val allPersons = mapOf(
    1 to Person("Adde", 45, "XVägen 1", "Stockholm" ),
    2 to Person("Bella", 14, "XVägen 2", "Stockholm"),
    3 to Person("Cecilia", 25, "XVägen 3", "Göteborg"),
    4 to Person("Doris", 92, "XVägen 4", "Göteborg"),
    5 to Person("Ernesto", 25, "XVägen 5", "Malmö"))


val allPersonList = listOf(Person("Adde", 45, "XVägen 1", "Stockholm"),
    Person("Bella", 14, "XVägen 2", "Stockholm"),
    Person("Cecilia", 25, "XVägen 3", "Göteborg"),
    Person("Doris", 92, "XVägen 4", "Göteborg"),
    Person("Ernesto", 25, "XVägen 5", "Malmö"))



fun main(){
    //groupBy, x as key, Person as Value
    //gruppering skapar values som är listor, där orginalobjekten ligger
    val grEx = allPersonList.groupBy(Person::city);
    println(grEx.map { "${it.key}: ${it.value}" })
    println(grEx.map { "${it.key}: ${it.value.map{it.name}}" })

    val grEx2 = allPersonList.groupBy(Person::age);
    println(grEx2.map { "${it.key}: ${it.value.map{it.name}}" })

    //associateBy, name as key, Person as Value
    val assByEx = allPersonList.associateBy { it.name }
    println(assByEx.map { "${it.key}: ${it.value}" })
    println(assByEx.map { "${it.key}: ${it.value.name}" })

    val assByEx2 = allPersonList.associateBy { it.city }
    println(assByEx2.map { "${it.key}: ${it.value}" })
    println(assByEx2.map { "${it.key}: ${it.value.name}" })

    //associateWith, Person as key, x as val
    val assWithEx = allPersonList.associateWith { it.name }
    println(assWithEx.map { "${it.key}: ${it.value}" })
    println(assWithEx.map { "${it.key.name}: ${it.value}" })

    val assWithEx2 = allPersonList.associateWith { it.city }
    println(assWithEx2.map { "${it.key}: ${it.value}" })
    println(assWithEx2.map { "${it.key.name}: ${it.value}" })

    //filterValues
    val filValEx = allPersons.filterValues { it.city.equals("Stockholm") }
    println(filValEx.map { "${it.key}: ${it.value.name}" })

    //filterKeys
    val filKeyEx = allPersons.filterKeys { it < 4 }
    println(filKeyEx.map { "${it.key}: ${it.value.name}" })

    //filter
    val filEx = allPersons.filter { it.key <4 && it.value.age==25 }
    println(filEx.map { "${it.key}: ${it.value.name}" })

    //any
    println(allPersons.any{it.value.age > 25})

    //all
    println(allPersons.all{it.value.age > 25})

    //maxOrByNull
    println(allPersons.maxByOrNull { it.value.age })


}











