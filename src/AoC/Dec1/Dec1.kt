package AoC.Dec1

import AoC.makeIntList



fun findAnswerUppgA(list : List<Int>) : Int{
    for (i in 0..list.size-1){
        for (j in i+1..list.size-1){
            if (list.get(i) + list.get(j) == 2020)
                return list.get(i) * list.get(j)
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



fun main(){
    println(findAnswerUppgA(makeIntList("src/AoC/Dec1/input.txt")))
    println(findAnswerUppgB(makeIntList("src/AoC/Dec1/input.txt")))
}
