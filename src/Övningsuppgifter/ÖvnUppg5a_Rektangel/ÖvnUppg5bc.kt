package Övningsuppgifter.ÖvnUppg5a_Rektangel

//Övninsguppgift 5b
fun String.doubleUp() = "$this$this"

//Övningsuppgift 5c
fun String.printRepeat(i : Int) : String {
    var temp = ""
    for (i in 1..i){
        temp += "$this"
    }
    return temp
}


fun String.printRepeatFrPhilip(i: Int): String{
    if(i <= 0) return "."
    return printRepeatFrPhilip(i-1) + this
}

fun String.printRepeatFrPhilip2(i: Int): String{
    if(i <= 0) return "."
    return this + printRepeatFrPhilip2(i-1)
}
/*
start: i = 3
return pRFP(2) + "Hi"
return (pRFP(1) + "Hi") + "Hi"
return ((pRFP(0) + "Hi")+ "Hi") + "Hi"
return (. + "Hi")+ "Hi") + "Hi"
.HiHiHi


 */

fun String.repeatUsingRecursion(i: Int): String {

    tailrec fun repeat(i: Int, acc: String = "$this"): String {
        if (i < 1) {
            //println("in if $acc")
            return acc
        }
        else {
            //println("in else $acc")
            return repeat(i - 1, "$this $acc")
        }
    }

    return repeat(i - 1)
}

/*
start: i = 3
repeat (2)
repeat (1, "Hi Hi")

 */


fun main(){
    val s = "sigrun"
    println(s.doubleUp())
    println("Hi".repeatUsingRecursion(3))
    println("Hi".doubleUp())
    println("Hi".printRepeat(5))
    println("Hi".printRepeatFrPhilip(3))
    println("Hi".printRepeatFrPhilip2(3))
}
