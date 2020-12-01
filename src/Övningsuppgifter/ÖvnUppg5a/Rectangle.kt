package Övningsuppgifter.ÖvnUppg5a

class Rectangle(val width: Double, val height: Double)

fun Rectangle.area(): Double{
    return width * height;
}

fun Rectangle.perimeter(): Double{
    return 2 * width + 2 * height;
}

fun main(){

    val rectangle = Rectangle(2.0, 3.0);
    val perimeterValue = rectangle.perimeter()
    println("Perimeter: $perimeterValue")
    val areaValue = rectangle.area()
    println("Area: $areaValue")
}