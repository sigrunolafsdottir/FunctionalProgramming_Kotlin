package Demos


fun main() {
    val ints = listOf(1, 2, 3)
    println( ints )

    //VI kan inte adda till en lista som inte är mutable
    //ints.add(6)

    for (e in ints) {
        print("$e ")
    }

    //om vi inte stoppar in värden i listOf måste vi ange typ
    val list2 : List<String> = listOf()

    //om vi ska kunna ändra i listan måste vi använda me mutable List
    val mutubleInts = mutableListOf(3,5,7,8,9)
    mutubleInts.add(7)
    mutubleInts += 8    //funkar som add

    //elementen i en lista kan pekas ut som i en java-array med []
    for (e in 0..ints.size-1) {
        println(ints[e])
    }

    //massa olika metoder för listor
    println(ints.takeLast(2))
    println(ints.first())
    println(ints.reversed())
    println(ints.lastIndexOf(5))

}