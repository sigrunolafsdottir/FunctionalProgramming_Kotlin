package AoC.AoC2020.Dec1

import java.io.File

//ordo(n), ordo (n2), ordo(n!)

fun findAnswerUppgA(list : List<Int>) : Int{
    for (i in 0..list.size-1){
        for (j in i+1..list.size-1){
            if (list.get(i) + list.get(j) == 2020)
                return list.get(i) * list.get(j)
        }
    }
    return 0   //hittade inget svar
}

fun findAnswerUppgA_Variant(list : List<Int>) : Int{
    for ((i, e1) in list.withIndex()){
        for (e2 in list.subList(i+1, list.size)){
            if (e1 + e2 == 2020) return e1 * e2
        }
    }
    return 0   //hittade inget svar
}

fun findAnswerUppgB(list : List<Int>) : Int{
    for (i in 0..list.size-1){
        for (j in i+1..list.size-1){
            for (k in j+1..list.size-1) {
                if (list.get(i) + list.get(j) + list.get(k) == 2020)
                    return list.get(i) * list.get(j) * list.get(k)
            }
        }
    }
    return 0   //hittade inget svar
}

fun findAnswerUppgB_Variant(list : List<Int>) : Int{
    for ((i, e1) in list.withIndex()){
        for ((j, e2) in list.subList(i + 1, list.size).withIndex()) {
            for (e3 in list.subList(j + 1, list.size)) {
                if (e1 + e2 + e3 == 2020) return e1 * e2 * e3
            }
        }
    }
    return 0   //hittade inget svar
}



fun main(){

    //Hur man kan skapa listor:
    //anropar funktion i Utils.ks:
    //val list : List<Int> = makeIntList("src/AoC/Dec1/input.txt")
    // samma men utan anrop:
    val list2 = File("src/AoC/Dec1/input.txt").readLines().map{it.toInt()}

    println(findAnswerUppgA(list2))
    println(findAnswerUppgA_Variant(list2))
    println(findAnswerUppgB(list2))
    println(findAnswerUppgB_Variant(list2))
}
