package com.kotlin.standardlib

fun main(args: Array<String>) {

    val emptyList = emptyList<String>()

    var fruits = listOf("apple", "mango")

    val numbers = 1..100
    println(fruits.javaClass)
    println(emptyList.javaClass)

    //creating a mutable cities

    val mutableCities = mutableListOf("Madrid", "Sydney")
    mutableCities.add("London")

    val cityCountryMap = hashMapOf(Pair("Madrid", "spain"), Pair("London", "UK"))


}