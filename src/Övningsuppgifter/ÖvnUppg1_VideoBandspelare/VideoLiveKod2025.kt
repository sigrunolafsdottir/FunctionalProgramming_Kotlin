package Övningsuppgifter.ÖvnUppg1_VideoBandspelare


fun main(){

    fun enoughTimeDemo(videoLen: Int, takenLen: Int, startH : Int, startM : Int, stopH: Int, stopM: Int )=
        ((videoLen - takenLen) > (60*(stopH-startH) + (stopM-startM)))


    println(enoughTimeDemo(90, 30, 20, 0, 20, 30))//true
    println(enoughTimeDemo(90, 60, 20, 0, 20, 50))  //false

}