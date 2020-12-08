package AoC.Dag7

import AoC.makeStringList


fun main(){

    val input = makeStringList ("src/AoC/Dag7/input.txt")

    data class Bag(val color : String)

    //jordens fulaste parsning...
    fun buildMap(input : List<String>) : Map<Bag, MutableList<Bag>> {
        var mappie : Map<Bag, MutableList<Bag>> = mutableMapOf()

        for (i in input){
            val kayValSplit = i.split(" bags contain ")

            var bagList : MutableList<Bag> = mutableListOf()
            val key : Bag = Bag(kayValSplit[0])

            val valSplit = kayValSplit[1].split(" bags, " , " bags.", " bag, ", " bag ")  //varje antal väskor
            valSplit.map{it.trim()}

            for (j in valSplit){
                if (!j.trim().equals("")){
                    val singleBagInfoSplit = j.trim().split(" ")  //varje ord för sig

                    if (singleBagInfoSplit[0].trim().get(0).isDigit()) {
                        bagList.add(
                            Bag(
                                singleBagInfoSplit[1].trim() + " " + singleBagInfoSplit[2].trim()
                            )
                        )
                    }
                }
            }
            mappie += key to bagList
            //bagList = mutableListOf()

        }
        return mappie
    }


    fun calculateNumberOfBags(parentalBags : MutableList<Bag>, bagMap : Map<Bag, List<Bag>>, lastLen : Int ) : Int {
        var tempList : MutableList<Bag> = mutableListOf()
        for (i in parentalBags){
            for (j in bagMap.entries){
                if (j.value.contains(i) ) if (!parentalBags.contains(j.key))tempList.add(j.key)
            }
        }
        parentalBags.addAll(tempList)
        println("${parentalBags.distinct().size} $parentalBags")
        if (lastLen == parentalBags.distinct().size) return parentalBags.distinct().size
        else calculateNumberOfBags(parentalBags, bagMap, parentalBags.distinct().size )

        return -1  //should not happen, not sure why this is returned

    }

    val bagMap = buildMap(input)
    val goldenBag = Bag("shiny gold")
    var bagList : MutableList<Bag> = mutableListOf(goldenBag)

    println(calculateNumberOfBags(bagList, bagMap, 1))

    //Answer is last printout from calculateNumberOfBags -1 (måste ta bort golden bag)

}
