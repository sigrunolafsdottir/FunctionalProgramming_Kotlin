package Övningsuppgifter.ÖvnUppg4_djur

fun main() {

    var katt = Djur(4, "katt")
    var hund = Djur(4, "hund")
    var spindel = Djur(8, "spindel")

    fun makeSound(input : Djur) : Unit {
        when (input.sort) {
            "katt" -> println("Mjau")
            "hund" -> println("Vov")
            "spindel" -> println("hssssss")
        }

    }

    makeSound(hund)
    makeSound(katt)
    makeSound(spindel)
}