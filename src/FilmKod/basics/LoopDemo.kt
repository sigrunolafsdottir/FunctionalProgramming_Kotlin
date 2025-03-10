package FilmKod.basics


val values = listOf("ole", "dole", "doff", "kinke", "lane", "koff")

val doubles= listOf(2.3, 5.6, 3.78)

fun main() {
    for (v in values) print("hej $v ")
    println()

    for (d in doubles) print(" $d ")
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

    for (c in '%'..'z') print(c)
    println()

    println()
    val s = "abcde"
    for (i in 0..s.lastIndex) print(s[i] +5 )
    println()
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