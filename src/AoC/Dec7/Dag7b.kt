package AoC.Dec7

import AoC.makeStringList

//inte klar ännu, kan hantera raka strukturer, men inte träd :(

fun main(){

    val input = makeStringList ("src/AoC/Dec7/input_mini.txt")

    data class Bag(val color : String, val nr : Char)

    //jordens fulaste parsning...
    fun buildMap(input : List<String>) : Map<String, MutableList<Bag>> {
        var mappie : Map<String, MutableList<Bag>> = mutableMapOf()

        for (i in input){
            val kayValSplit = i.split(" bags contain ")

            var bagList : MutableList<Bag> = mutableListOf()
            val key : String = kayValSplit[0]

            val valSplit = kayValSplit[1].split(" bags, " , " bags.", " bag, ", " bag ")  //varje antal väskor
            valSplit.map{it.trim()}

            for (j in valSplit){
                if (!j.trim().equals("")){
                    val singleBagInfoSplit = j.trim().split(" ")  //varje ord för sig

                    if (singleBagInfoSplit[0].trim().get(0).isDigit()) {
                        bagList.add(
                            Bag(
                                singleBagInfoSplit[1].trim() + " " + singleBagInfoSplit[2].trim(),
                                singleBagInfoSplit[0].trim().get(0)
                            )
                        )
                    }
                }
            }
            mappie += key to bagList
        }
        return mappie
    }

    val bagMap = buildMap(input)
    var acc : Int = 1

    fun calculateNumberOfBags(parentalBag : Bag) : Int {
        var tempList : MutableList<Bag> = mutableListOf()
        //hittar nuvarande väskas barn
        for (j in bagMap.entries){
            if (j.key.equals(parentalBag.color) ){
                //println("adding to temp list ${j.key} ${j.value}")
                tempList.addAll(j.value)
            }
        }

        var antal : Int = parentalBag.nr.toInt() -48  //sjukt fult, -48 pga ascii-kod
        println("templist $tempList $antal  $acc")
        //antal tas med för många gåner eftersom jag gör detta i en for-loop
        //Måste läsa på hur man traverserar träd och göra om min datastruktur till ett sådant
        for (i in tempList){  //implicit slutvillkor -> när tempList inte har några element slutar vi snurra
            println("före rekursivt anrop $antal $acc")
            acc += antal + (antal * calculateNumberOfBags(i))
        }

        return acc
    }


    //bagMap.forEach { (key, value) -> println("$key = $value") }

    val goldenBag = Bag("shiny gold", '1')

    println(calculateNumberOfBags(goldenBag) -1)



}
