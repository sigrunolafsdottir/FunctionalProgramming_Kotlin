package Övningsuppgifter

//Övninsguppgift 5b
fun String.doubleUp() = "$this$this"

//Övningsuppgift 5c
fun String.printRepeat(i : Int) : String {
    var temp: String = ""
    for (i in 1..i){
        temp += "$this"
    }
    return temp
}


fun main(){

    println("Hi".doubleUp())
    println("Hi".printRepeat(5))
}
