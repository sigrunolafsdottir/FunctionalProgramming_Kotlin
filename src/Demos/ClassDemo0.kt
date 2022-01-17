package Demos

class Alien(var name: String)

class SecretAgent(name: String){

    val greeting = "hello $name"

 //   fun funTest(){
  //      println(" bla $name bla")
  //  }

}

fun main() {

    var secretAgent = SecretAgent("Sigrun")
    //can not access name
    //println(secretAgent.name)
    println(secretAgent.greeting)

    val alien1 = Alien("Reverse Giraffe")
    println(alien1.name)   // ger “Reversable Giraffe”

    alien1.name = "Parasite"
    println(alien1.name) // ger “Parasite”


}
