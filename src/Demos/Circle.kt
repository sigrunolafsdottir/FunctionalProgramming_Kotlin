package Demos

class Circle(val radius: Double){
    
    fun area(): Double{ 
        return Math.PI * radius * radius; 
    } 
}

fun Circle.perimeter(): Double{ 
        return 2 * Math.PI * radius; 
}




fun main(){
    
      val circle = Circle(5.5); 
      val perimeterValue = circle.perimeter()
      println("Perimeter: $perimeterValue")
      val areaValue = circle.area()
      println("Area: $areaValue")
}