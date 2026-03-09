package Demos.Livekodning


fun faculty(i : Long) : Long{
    if (i <= 1) return i
    else {
        //println("i är $i")
        return i * faculty(i-1)
    }
}

// return 3 * faculty(2)
//return 3* (2 * faculty(1))
// return 3 * (2 *1)
//return 3 * 2
// return 6   KLARA

fun facTail(i : Long) : Long{

    tailrec fun inner (acc : Long, i : Long) : Long{
        if (i <= 1) return acc
        else return inner (acc*i, i-1)
    }

    return inner(1, i)
}

// inner (1, 3)
//inner (3, 2)
//inner (6, 1)
//return 6 (slutmål uppnått)


fun main(){
   // println(faculty(3))   //3*2*1
    println(facTail(5))

}