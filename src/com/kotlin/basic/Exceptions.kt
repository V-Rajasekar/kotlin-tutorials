package com.kotlin.basic

import java.io.BufferedReader
import java.io.FileReader
import java.nio.CharBuffer

class NotANumberException(message: String): Throwable(message) {

}

fun isNumber(obj: Any) {
    when(obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("It's not a Number")
    }
}
fun main() {
    try {
        isNumber("Hello")
    } catch (ie: IllegalArgumentException) {
        println("Illegal Argument Exception")
    } catch (e: NotANumberException) {
        println("It was not a number: ${e.message}")
    }

    var charBuffer = CharArray(30)
    var bfReader = BufferedReader(FileReader("resources/input.txt"))

    try {
        bfReader.read(charBuffer, 0, 40)
    } catch (ex: IndexOutOfBoundsException) {
        println("Caught exception: $ex")
    } finally {
        println("finally")
        bfReader.close()
    }

}