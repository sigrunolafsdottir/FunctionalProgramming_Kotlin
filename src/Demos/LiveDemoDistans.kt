package Demos




data class Book(val title: String, val author: String, var grade : Int)



fun main(){

    val b = Book("Sagan om Ringen", "Tolkein", 5)
    val b2 = Book("Sagan om de 2 tornen", "Tolkein", 4)
    val b3 = Book("Sagan om Ringen", "Tolkein", 5)

    println(b2.title)
    b2.grade = 5

    println(b.equals(b3))
    println(b == b3)



}