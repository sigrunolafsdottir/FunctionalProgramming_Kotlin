package Övningsuppgifter.Rekursion

fun main () {

    fun paranthesisCount(word :String, count: Int) : Int  {
        if (word.length == 0) return count
        return if (word.first() == '(') {
            paranthesisCount(word.takeLast(word.count() -1), count + 1)
        }
        else if (word.first() == ')') {
            paranthesisCount(word.takeLast(word.count() -1), count -1)

        }
        else paranthesisCount(word.takeLast(word.count() -1), count)
    }

    fun areParanthesisEqual(word :String): Boolean {
        return if (paranthesisCount(word, 0) == 0) true else false
    }


    println(areParanthesisEqual("((v))"))
    println(areParanthesisEqual("(((((v))"))

}