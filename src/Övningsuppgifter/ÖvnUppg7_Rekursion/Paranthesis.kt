package Övningsuppgifter.ÖvnUppg7_Rekursion

fun main () {

    tailrec fun paranthesisCount(word :String, count: Int) : Int  {
        if (word.length == 0) return count

        return when (word.first()){
            '(' -> paranthesisCount(word.takeLast(word.count() -1), count + 1)
            ')' ->  paranthesisCount(word.takeLast(word.count() -1), count -1)
            else -> paranthesisCount(word.takeLast(word.count() -1), count)
        }
    }


    fun areParanthesisEqual(word :String): Boolean {
        return if (paranthesisCount(word, 0) == 0) true else false
    }


    println(areParanthesisEqual("((v))"))
    println(areParanthesisEqual("(((((v))"))

}