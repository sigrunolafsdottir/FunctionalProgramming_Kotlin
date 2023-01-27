package FilmKod.FunktionellProgrammering

fun main(){

    val list1 = listOf(2,23,54,532,6,37,5,4,3,65,32,765,)

    println(list1.map{i -> i+3})

    println(list1.map{it+3})

    println(list1.mapIndexed { index, i -> " $index: $i" })

    println(list1.mapIndexed { index, _ -> " $index" })

    list1.forEach{print(" $it" )}
    println()

    println(list1.filter{it < 20})

    println(list1.filter{it < 20}.count())

    println(list1.count{it < 20})

    println(list1.filter({it < 20}).any())

    println(list1.any{it < 20})

    println(list1.joinToString { " $it " })

    println(list1.joinToString(transform = { " $it " }, separator="x", postfix="end"))

    println(list1.joinToString(separator="y", postfix="end"){ " $it " })


    val isEven = {i : Int -> i % 2 == 0}
    println(list1.filter(isEven))

    val p = 4    //closure
    val isDIvidebleBy4 = {i : Int -> i % p == 0}
    println(list1.filter(isDIvidebleBy4))

}