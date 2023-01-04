package AoC.AoC2022.Dec7

import java.io.File

class Node(
    var size: Int,
    var name: String,
    var type: Char,  //file of dir
    var parent: Node?,  //file of dir
    var children: MutableList<Node> = mutableListOf())


class Dec7(data: List<String>) {

    val input = data
    var tree = Node(0, "/", 'D', null)
    var directoryList : MutableList<String> = mutableListOf()
    var sizeSum : Int = 0
    var sizeMap : MutableMap<String, Int> = mutableMapOf()

    fun buildTree(){
        println("in tree")
        var currentNode = tree
        var i = 0 //does nothing

        for (p in input) {
            //println("in tree "+p)
            val instr = p.split(" ")
            when (instr[0]) {
                "dir" -> {
                    currentNode.children.add(Node(0, instr[1] ,'D', currentNode)) //add new node
                    directoryList.add(instr[1])
                }
                "$" ->
                    when(instr[1]){
                        "cd" -> if(instr[2].equals("..")) {    //going up
                                    currentNode = currentNode.parent!!
                                }
                                else if(instr[2].equals("/") ) {    //going to top
                                    currentNode = tree
                                }
                                else {   //going into a new dir
                                    currentNode = currentNode.children.first { it.name.equals(instr[2]) }
                                }
                        "ls" -> i++
                        }

                else -> currentNode.children.add(Node(instr[0].toInt(), instr[1] ,'F', currentNode))  //found a file
            }
        }
    }

    //TODO gör rekursionen
    fun getDirSize(dirName : String,  ffound : Boolean, sum: Int, node : Node) : Int {
        return sum
    }

    fun solA(): Int {
        buildTree()
        println(directoryList)

        directoryList.map{getDirSize(it, false, 0, tree)}

        return sizeMap.values.sum()
    }

    fun solB() = 3

}

fun main(){
    val data: List<String> = File("src/AoC/AoC2022/Dec7/input.txt").readLines()
    println("Solution A: "+ Dec7(data).solA())
    println("Solution B: "+ Dec7(data).solB())

}