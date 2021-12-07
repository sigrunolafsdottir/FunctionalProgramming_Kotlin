package AoC.AoC2021.Dec1


import AoC.AoC2020.makeIntList

class Dec1Windowed(data: List<Int>) {

    val input = data

    //skapar en lista av listor där varje sublista är lika stor som windowSize
    //varje sublista börjar med ett tal i input och fortsätter med nästa och nästa
    //för windowSize=2: [1,2,3,4] -> [[1,2], [2,3],[3,4]]
    //för windowSize=3: [1,2,3,4] -> [[1,2,3],[2,3,4]]
    fun getWindowedList(windowSize: Int, input: List<Int> ) = input.windowed(size=windowSize)

    //andra lösningar till a-uppgiften:
    // getWindowedList(2, input).filter{it[0] < it[1]}.count()
    // getWindowedList(2, input).count{it[0] < it[1]}
    // getWindowedList(2, input).count{(a,b) -> b > a}
    fun solA()  = getWindowedList(2, input).filter{it.elementAt(0) < it.elementAt(1)}.count()

    //summerar alla tripletter och gör sedan fönster med par, som i a-uppgiften
    fun solB() = getWindowedList(3, input).map{it.sum()}.windowed(2).count{it[0] < it[1]}

}

fun main(){
    val data: List<Int> = makeIntList("src/AoC/AoC2021/Dec1/input.txt")
    println("Solution A: "+Dec1Windowed(data).solA())
    println("Solution B: "+Dec1Windowed(data).solB())
}

