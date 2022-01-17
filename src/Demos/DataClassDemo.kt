package Demos


    class Person(val name: String)

    data class DataPerson(val name: String)

    data class Contact(
        val name: String,
        val number: String
    )

    fun main(){
        val p1 = Person("Sigrun")
        val p2 = Person("Sigrun")
        println(p1 == p2)

        val c1 = Contact("Sigrun", "123")
        val c2 = Contact("Sigrun", "123")
        println(c1 == c2)

        val d1 = DataPerson("Sigrun")
       // println(p1 == d1)
       // println(c1 == d1)

    }

