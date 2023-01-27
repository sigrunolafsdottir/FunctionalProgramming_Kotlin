package FilmKod.KlasserMedMera


fun main(){

    while(true){
        println("Skriv in en dag")
        val dag = readLine()

        when(dag){
            "måndag" -> println("Månens dag")
            "tisdag" -> println("Tyrs dag")
            "onsdag" -> println("Odens dag")
            "torsdag" -> println("Tors dag")
            "fredag" -> println("Frejas dag")
            "lördag" -> println("Baddagen")
            "söndag" -> println("Solens dag")
            else -> println("Skriv in en giltig dag")
        }

    }
}