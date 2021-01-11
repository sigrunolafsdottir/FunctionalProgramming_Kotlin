package gammaltSkrap.helloWorldExercise1

fun main() {


        val list = listOf(1, 2, 3, 4)
        val result = list.map({ n: Int -> "[$n]" })
        println(result)

        val list3 = listOf(9, 11, 23, 32)
        println(list3.joinToString(" aa ") { "[$it]" } )



        val list2 = listOf('a', 'b', 'c', 'd')
        val result2 = list2.map { "[$it]" }
        println(result2 )

}




