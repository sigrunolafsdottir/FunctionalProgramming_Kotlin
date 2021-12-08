package AoC.AoC2021.Dec8

import AoC.AoC2020.*


class Dec8(data: List<Pair<String, String>>) {

    val input = data

    fun solA() =  input.map{p -> p.second.split(" ", ",")}.flatten()
        .filter{it.length in setOf(2,3,4,7) }.count()


    fun generateKeyList (keyRow: MutableList<String>) : List<String>{
        val res : MutableList<String> = createStringList(10, "")
        res[1] = keyRow.filter{it.length == 2}.first()   //kommer bara att finnas en
        keyRow.remove(res[1])
        res[4] = keyRow.filter{it.length == 4}.first()   //kommer bara att finnas en
        keyRow.remove(res[4])
        res[7] = keyRow.filter{it.length == 3}.first()   //kommer bara att finnas en
        keyRow.remove(res[7])
        res[8] = keyRow.filter{it.length == 7}.first()   //kommer bara att finnas en
        keyRow.remove(res[8])

        //0, 6 och 9 har lika många segment, 0 och 9 innehåller bägge bokstäverna i 1, men det gör inte 6
        res[6] = keyRow.filter{it.length == 6 && !it.toSet().containsAll(res[1].toSet())}.first()
        keyRow.remove(res[6])

        //9 innehåller alla 4ans segment, det gör inte nollan
        res[9] = keyRow.filter{it.length == 6 && it.toSet().containsAll(res[4].toSet())}.first()
        keyRow.remove(res[9])

        //bara ett tal kvar med 6 segment, måste vara 0
        res[0] = keyRow.filter{it.length == 6}.first()
        keyRow.remove(res[0])

        //2,3,5 har samma längd, bara 3 innehåller alla bokstäver i 1
        res[3] = keyRow.filter{it.length == 5 && it.toSet().containsAll(res[1].toSet())}.first()
        keyRow.remove(res[3])

        //5 innehåller alla nians segment, det gör inte 2
        res[5] = keyRow.filter{it.length == 5 && res[9].toSet().containsAll(it.toSet())}.first()
        keyRow.remove(res[5])

        res[2] = keyRow.first()

        return res
    }


    fun findNumber(keyList : List<String>, message:String) =
        keyList.indexOf(keyList.filter{it.toSet().equals(message.toSet())}.first())


    fun getFinal4DigitNumber(keyList : List<String>, message: List<String>) : Int{
        var mult = 1
        var sum = 0
        for (m in message.size-1 downTo 0){
            sum += mult * findNumber(keyList, message[m])
            mult *= 10
        }
        return sum
    }

    fun solB(): Int {
        var sum = 0
        for (p in input) {
            val keyList = generateKeyList(p.first.split(" ").toMutableList())
            sum += getFinal4DigitNumber(keyList, p.second.split(" "))
        }
        return sum
    }
}


    fun main(){
        val data: List<Pair<String, String>> = makePairList2("src/AoC/AoC2021/Dec8/input.txt", "|")
        println("Solution A: "+Dec8(data).solA())  //470
        println("Solution B: "+Dec8(data).solB())  //989296
    }
