package AoC

import java.io.File


fun makeIntList (fileName : String) = File(fileName).readLines().map{it.toInt()}

fun makeStringList (fileName : String) = File(fileName).readLines()
