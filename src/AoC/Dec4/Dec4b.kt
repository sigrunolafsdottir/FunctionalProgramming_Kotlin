package AoC.Dec4

import AoC.makeStringList


//funkar inte riktigt...

fun main(){

    val input = makeStringList ("src/AoC/Dec4/input_mini_invalid")

    fun assembleData(rawInput : List<String>) : List<String> {
        var result: MutableList<String> = mutableListOf()
        var temp: String = ""
        var first: Boolean = true

        for (i in rawInput) {
            if (i.equals("")) {
                result.add(temp)
                temp = ""
                first = true
            } else {
                temp += if(!first) " " + i else i
                first = false
            }
        }
        result.add(temp)
        return result
    }

    //Uppg 4a, filtrerar bort alla pass med fel antal fält
    fun checkOk1 (cleanInput : List<String>) : List<String> =
        cleanInput.filter{it.count{it == ':'} == 8
                || (it.count{it == ':'} == 7 && !it.contains("cid:"))}

    //Uppg 4b, här är det några som fortfarande slinker igenom
    fun checkOk2(cleanInput : List<String>) : Int {
        var counter : Int = 0
        for (i in cleanInput){
            var ok : Boolean = true
            val fields = i.split(" ")
            println(fields)
            for (j in fields){
                var keyVal = j.split(":")

                when (keyVal[0]) {
                    "byr" ->
                        if (keyVal[1].toInt() !in 1920..2020) {
                            ok = false
                            println("byr false")
                        }
                    "iyr" ->
                        if (keyVal[1].toInt() !in 2010..2020) {
                            ok = false
                            println("iyr false")
                        }
                    "eyr" ->
                        if (keyVal[1].toInt() !in 2020..2030) {
                            ok = false
                            println("eyr false")
                        }
                    "ecl" ->
                        if (keyVal[1] !in listOf( "amb", "blu", "brn", "gry", "grn", "hzl", "oth" )) {
                            ok = false
                            println("ecl false")
                        }
                    "pid" ->
                        if (!"^[0-9]{9}$".toRegex().matches(keyVal[1])){
                            ok = false
                            println("pid false")
                        }
                    "hcl" -> {
                        if (!"^#[0-9a-f]{6}$".toRegex().matches(keyVal[1])) {
                            ok = false
                            println("hcl false")
                        }
                    }
                    "hgt" -> {
                        val (number, unit) = keyVal[1].take(keyVal[1].length -2).toInt() to keyVal[1].takeLast(2)
                        if (!(unit.equals("cm") || unit.equals("in"))) {
                            ok = false
                            println("hgt1 false")
                        }
                        else if (unit.equals("cm") && number !in 150..193 )  {
                            ok = false
                            println("hgt2 false")
                        }
                        else if (unit.equals("in") && number !in 59..76 )  {
                            ok = false
                            println("hgt3 false")
                        }
                    }
                    "cid" -> {}
                    else -> {
                        ok = false
                        println("else happened, unknown field")
                    }

                }
            }
            if (ok) counter++
        }
        return counter
    }

    //input.forEach{println(it)}
   // println(assembleData(input))
   // println(checkOk1(assembleData(input)))
    println(checkOk2(checkOk1(assembleData(input))))
}