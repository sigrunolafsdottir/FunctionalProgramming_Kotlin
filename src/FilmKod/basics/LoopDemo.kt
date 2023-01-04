package FilmKod.basics


val values = listOf("ole", "dole", "doff", "kinke", "lane", "koff")

fun main() {
    for (v in values) print("$v ")
    println()

    for ((i, v) in values.withIndex()) print("$i.$v ")
    println()

    for (i in 1..3)  print("Hey $i! ")
    println()

    for (i in 5 downTo 1)  print("Hey $i! ")
    println()

    for (i in 1..6 step 2)  print("Hey $i! ")
    println()

    println((1..10).random())

    for (c in 'a'..'z') print(c)
    println()

    val s = "abcde"
    for (i in 0..s.lastIndex) print(s[i] + 1)
    println()

    for (ch in "Jnskhm ") print(ch + 1)
    println()

    repeat(2) {
        println("hi!")
    }

    repeat(3) {
        index -> println("hi $index")
    }



}