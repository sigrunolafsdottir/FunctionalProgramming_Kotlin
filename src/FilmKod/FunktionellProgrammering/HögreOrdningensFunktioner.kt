package FilmKod.FunktionellProgrammering

fun main(){

    fun repeat1(times: Int, action: () -> Unit){
        for (i in 0 until times){
            action()
        }
    }


    fun repeat2(times: Int, action: (Int)-> Unit){
        for (i in 0 until times){
            action(i)
        }
    }

    repeat1(5){println("hej")}
    repeat1(2, {println("då")})

    repeat2(3){i -> println("hej $i")}

    val f = {println("valtest")}
    repeat1(5, f)

    fun funtest() = println("valtest2")
    repeat1(5, {funtest()})
    repeat1(5) {funtest()}
    repeat1(5, ::funtest)
}