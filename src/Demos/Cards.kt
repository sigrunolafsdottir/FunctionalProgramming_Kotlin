package Demos

import kotlin.random.Random

enum class Suit {
    Spade, Club, Heart, Diamond
}

enum class Rank(val faceValue: Int) {
    Ace(1), Two(2), Three(3), Four(4), Five(5),
    Six(6), Seven(7), Eight(8), Nine(9),
    Ten(10), Jack(10), Queen(10), King(10)
}

class Card(val rank: Rank, val suit: Suit) {
    override fun toString() =
        "$rank of ${suit}s"
}

//inner lambda creates a lsit of all cards in one suite
//outer lambda flattens the deck
val deck: List<Card> =
    Suit.values().flatMap { suit ->
        Rank.values().map { rank ->
            Card(rank, suit)
        }
    }

//creates all spade cards
val test: List<Card> =
        Rank.values().map { rank ->
            Card(rank, Suit.Spade)
        }


fun main() {

    println(test)

    val rand = Random(24)
    repeat(7) {
        println("'${deck.random(rand)}'")
    }

}