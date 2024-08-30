package com.kotlin.standardlib

fun main() {
    var elements = 1..100000
   // val result = elements.filter { it < 30 }.map { Pair("yes", it) }
    val result = elements.asSequence().filter { it < 30 }.map { Pair("yes", it) }
    result.forEach { println(it) }

    println("Sum of first 20 elements:"+ elements.asSequence().take(20).sum())

    val generateSequence = generateSequence(1) { x -> x + 10 }
    println(generateSequence.take(4).sum())
}