package com.kotlin.basic

import com.kotlin.classes.Customer

fun capitalPopulation(): Pair<String, Long> {
    return Pair("Paris", 5000000)
}

fun countryInformation(countryCode: String): Triple<String, String, Long> {
    return Triple("India", "Chennai", 5000000)
}


fun main() {

    //Triple
    val triple = countryInformation("Ind")
    println(triple.first)
    println(triple.second)
    println(triple.third)


    //Pair or Tuple with Deconstructing values
    val (capital, population) = capitalPopulation()
    println(capital)
    println(population)

    val (id, name, email) = Customer(10, "Mike", "Mike@gmail.com", phone="")
    println(email)

    val countryCapitals = listOf(Pair("New Delhi", "India"), "London" to "UK")
    for ((capital, country) in countryCapitals) {
        println("$country - $capital")
    }

}