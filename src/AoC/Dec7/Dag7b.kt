package AoC.Dec7

import AoC.makeStringList

//inte klar ännu

fun main(){

    val input = makeStringList ("src/AoC/Dag7/input_mini.txt")

    data class Bag(val color : String, val nr : Int)

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
                        println(singleBagInfoSplit[0].trim().get(0).toInt())
                        bagList.add(
                            Bag(
                                singleBagInfoSplit[1].trim() + " " + singleBagInfoSplit[2].trim(),
                                singleBagInfoSplit[0].trim().get(0).toInt()
                            )
                        )
                    }
                }
            }
            mappie += key to bagList
        }
        return mappie
    }

/*
    fun calculateNumberOfBags(parentalBags : MutableList<Bag>, bagMap : Map<String, List<Bag>>, lastLen : Int ) : Int {
        var tempList : MutableList<Bag> = mutableListOf()
        for (i in parentalBags){
            for (j in bagMap.entries){
                if (j.value.contains(i) ) if (!parentalBags.contains(j.key))tempList.add(j.key)
            }
        }
        parentalBags.addAll(tempList)
        println("${parentalBags.distinct().size} $parentalBags")
        return if (lastLen == parentalBags.distinct().size) return parentalBags.distinct().size
        else calculateNumberOfBags(parentalBags, bagMap, parentalBags.distinct().size )
    }
*/
    val bagMap = buildMap(input)
    val goldenBag = Bag("shiny gold", 0)
    var bagList : MutableList<Bag> = mutableListOf(goldenBag)

  //  println(calculateNumberOfBags(bagList, bagMap, 1) -1)



}
