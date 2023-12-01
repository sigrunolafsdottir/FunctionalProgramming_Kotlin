package Demos

class Alien(var name: String = "Olle")

class SecretAgent(name: String){

    val greeting = "hello $name"

    fun defaultParamTest(i : Int = 4, j: Int = 7){
        println(i+j)
    }

 //   fun funTest(){
 //       println(" bla $name bla")
 //   }
}

fun main() {

    var secretAgent = SecretAgent("Sigrun")
    //can not access name
   // println(secretAgent.name)
  //  secretAgent.funTest()

    secretAgent.defaultParamTest()
    secretAgent.defaultParamTest(j = 9)
    secretAgent.defaultParamTest(j = 5, i = 1)
    println(secretAgent.greeting)

    val alien1 = Alien("Reverse Giraffe")
    println(alien1.name)   // ger “Reversable Giraffe”

    alien1.name = "Parasite"
    println(alien1.name) // ger “Parasite”

    val alien2 = Alien()
    println(alien2.name)

}
