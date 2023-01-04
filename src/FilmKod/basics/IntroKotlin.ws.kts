println("Hello World!")

fun helloWorld(){
    println("Hello World!")
}

helloWorld()


fun giveMeFive() :Int {
    return 5
}

fun giveMeFive2() = 5

println(giveMeFive())
println(giveMeFive2())

giveMeFive2() + giveMeFive()


val i = 5
//i = 6   //funkar inte!

var i2 = 3
i2 = 4   //inga problem

val i3 : Int = 56

val name = "sigrun"

i + giveMeFive()

fun giveMeFiveWithParams(x : Int, y: String) = "hej $y, du sa $x"

giveMeFiveWithParams(23, "sigrun")







