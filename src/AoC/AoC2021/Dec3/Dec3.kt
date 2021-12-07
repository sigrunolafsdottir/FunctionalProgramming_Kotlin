package AoC.AoC2021.Dec3

import AoC.AoC2020.makeStringList


class Dec3(data: List<String>) {

        var input = data
        var epsilon = ""
        var gamma = ""

        fun solA(): Int {
            for (i in 0..input[0].length-1) {
                val counter0 = input.count{it[i] == '0'}
                val counter1 = input.count{it[i] == '1'}

                if (counter1 > counter0){
                    epsilon += "1"
                    gamma += "0"
                }
                else{
                    epsilon += "0"
                    gamma += "1"
                }
             }

            return epsilon.toInt(2)*epsilon.toInt(2)
        }

    fun solB() : Int {
        val wordlen = input[0].length
        var ox = input
        var co2 = input
        var oxNumber = 0
        var coNumber = 0
        for (i in 0..wordlen-1) {
            val counter0 = ox.count{it[i] == '0'}
            val counter1 = ox.count{it[i] == '1'}

            if (counter1 >= counter0){
                ox = ox.filter{it[i].equals('1')}
            }
            else if (counter1 < counter0){
                ox =ox.filter{it[i].equals('0')}
            }
            if (ox.size == 1){
                oxNumber = ox[0].toInt(2)
            }
        }

        for (i in 0..wordlen-1) {

            val counter0 = co2.count{it[i] == '0'}
            val counter1 = co2.count{it[i] == '1'}

            if (counter1 >= counter0){
                co2 = co2.filter{it[i].equals('0')}
            }
            else if (counter1 < counter0){
                co2 =co2.filter{it[i].equals('1')}
            }
            if (co2.size == 1){
                coNumber = co2[0].toInt(2)
            }
        }
        return coNumber * oxNumber
    }
}


    fun main(){
        val data: List<String> = makeStringList("src/AoC/AoC2021/Dec3/input.txt")
        println("Solution A: "+Dec3(data).solA())
        println("Solution B: "+Dec3(data).solB())
    }
