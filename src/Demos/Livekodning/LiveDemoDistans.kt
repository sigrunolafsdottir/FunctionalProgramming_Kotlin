package Demos.Livekodning




class Book(var title: String, val author: String, var grade : Int)



fun main(){

    val b = Book("Sagan om Ringen", "Tolkien", 5)
    val b2 = Book("Sagan om de 2 tornen", "Tolkien", 4)
    val b3 = Book("Sagan om Ringen", "Tolkien", 5)

    println(b.author)

    b.grade = 3

    println(b.grade)




}