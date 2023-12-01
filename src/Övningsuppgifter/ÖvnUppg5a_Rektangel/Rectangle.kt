package Övningsuppgifter.ÖvnUppg5a_Rektangel

data class Rectangle(val width: Double, val height: Double)

fun Rectangle.area(): Double{
    return width * height;
}

fun Rectangle.perimeter(): Double{
    return 2 * width + 2 * height;
}

fun main(){

    val rectangle = Rectangle(2.0, 3.0);
    val rectangle2 = Rectangle(2.0, 3.0);
    val rectangle3 = Rectangle(1.0, 3.0);
    val perimeterValue = rectangle.perimeter()
    println("Perimeter: $perimeterValue")
    val areaValue = rectangle.area()
    println("Area: $areaValue")

    println(rectangle2.equals(rectangle))
    println(rectangle3.equals(rectangle))
}