package AoC.AoC2021.Dec13

import AoC.AoC2020.*


class Dec13(data: List<Pair<Int, Int>>, folds: List<Pair<Char, Int>>) {

    val input = data
    val foldList = folds
    val initialFold = folds.first()

    val maxX = input.maxOf{it.first}
    val maxY = input.maxOf{it.second}

    var matrix = createMatrix(maxX+1, maxY+1, 0)

    fun fillInitialMatrix(m: MutableList<MutableList<Int>>) : MutableList<MutableList<Int>>{
        for (p in input){
            m[p.second][p.first] = 1
        }
        return m
    }


    fun counter(m: MutableList<MutableList<Int>>) : Int = m.sumOf{it.sum()}

    fun getMatrixPartVertSplit(m: MutableList<MutableList<Int>>, start: Int, stop: Int) : MutableList<MutableList<Int>>{
        return m.subList(start, stop)
    }

    fun getMatrixPartHorSplit(m: MutableList<MutableList<Int>>, start: Int, stop: Int) : MutableList<MutableList<Int>>{
        var newMatrix : MutableList<MutableList<Int>> = mutableListOf()
        for (i in 0..m.size-1){
            newMatrix.addAll(listOf(m[i].subList(start, stop)))
        }

        return newMatrix
    }

    fun turnUpsideDown(m: MutableList<MutableList<Int>>) : MutableList<MutableList<Int>>{
        return m.reversed().toMutableList()
    }

    fun mirrorLeftRight(m: MutableList<MutableList<Int>>) : MutableList<MutableList<Int>>{
        return m.map{it.reversed().toMutableList()}.toMutableList()
    }

    fun overlap(m1: MutableList<MutableList<Int>>, m2: MutableList<MutableList<Int>>) : MutableList<MutableList<Int>>{
        for (i in 0..m1.size-1){
            for (j in 0..m1[0].size-1){
                if (m2[i][j] == 1) m1[i][j] = 1
            }
        }
        return m1
    }



    fun solve(): Int {
        var workMatrix = fillInitialMatrix(matrix)
        for (p in foldList){
            if (p.first == 'y'){
                workMatrix = overlap(getMatrixPartVertSplit(workMatrix, 0, p.second),
                    turnUpsideDown(getMatrixPartVertSplit(workMatrix, p.second+1, workMatrix.size)))
            }
            else if (p.first == 'x'){
                workMatrix = overlap(getMatrixPartHorSplit(workMatrix, 0, p.second),
                    mirrorLeftRight(getMatrixPartHorSplit(workMatrix, p.second+1, workMatrix[0].size)))
            }
        }
        if (foldList.size > 10) {   //visa bara b-uppgiften
            workMatrix.forEach { println(it) }
        }

        return counter(workMatrix)
    }


}


    fun main(){
        val data: List<Pair<Int, Int>> = makePairList3("src/AoC/AoC2021/Dec13/input.txt", ",")
        val foldsA : List<Pair<Char, Int>> = listOf(Pair('x', 655))
        val foldsB : List<Pair<Char, Int>> = listOf(Pair('x', 655), Pair('y', 447), Pair('x', 327), Pair('y', 223),
                Pair('x', 163), Pair('y', 111), Pair('x', 81), Pair('y', 55),
        Pair('x', 40), Pair('y', 27), Pair('y', 13), Pair('y', 6))
        println("Solution A: "+Dec13(data, foldsA).solve())
        println("Solution B: "+Dec13(data, foldsB).solve())
    }
