package Demos



fun main() {
    val result1 = if (11 > 42) 9 else 5   // ger 5

    val result2 = if (1 < 2) {   //ger 53
        val a = 11
        a + 42
    } else 42

    val result3 =
        if ('x' < 'y')
            println("x < y")   //true
        else
            println("x > y")


    println(result1)
    println(result2)
    println(result3)

}

