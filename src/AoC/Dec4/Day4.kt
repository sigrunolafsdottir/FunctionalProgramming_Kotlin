package AoC.Dec4

import AoC.makeStringList

//Delvis snodd lösning - men sjukt snygg!

fun main() {

    val input = makeStringList ("src/AoC/Dec4/input.txt")


    data class Field(private val key: String, private val value: String) {
        private fun String.splitAt(index: Int) = take(index) to substring(index)
        fun isMandatory() = key != "cid"
        fun isValid() = when (key) {
            "byr" -> value.toInt() in 1920..2002
            "iyr" -> value.toInt() in 2010..2020
            "eyr" -> value.toInt() in 2020..2030
            "ecl" -> value in listOf("amb", "blu", "brn", "gry", "grn", "hzl", "oth")
            "hcl" -> "^#[0-9a-f]{6}$".toRegex().matches(value)
            "pid" -> "^[0-9]{9}$".toRegex().matches(value)
            "hgt" -> {
                val (number, unit) = value.splitAt(value.length - 2)
                when (unit) {
                    "cm" -> number.toInt() in 150..193
                    "in" -> number.toInt() in 59..76
                    else -> false
                }
            }
            else -> true
        }
    }

    data class Passport(private val fields: List<Field>) {
        val hasAllMandatoryFields = fields.count { it.isMandatory() } == 7
        val isValid = hasAllMandatoryFields && fields.all { it.isValid() }
    }

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

    fun parseInput(input: List<String>): List<Passport> {
        return input.map { passport ->
            passport.split(" ", "\n")
                .map { it.split(":").let { (key, value) -> Field(key, value) } }
                .let { Passport(it) }
        }
    }

    val passports = parseInput(assembleData(input))


    println(passports.count { it.isValid })
}