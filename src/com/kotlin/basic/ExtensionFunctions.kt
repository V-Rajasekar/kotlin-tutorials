package com.kotlin.basic

import com.kotlin.classes.Customer

/**
 * Extension functions are
 */
fun String.hello() {
    println("Its String hello function")
}

fun String.toHeading1(): String {
    return this.split(" ").joinToString(" ") { it.uppercase() }
}

fun Customer.extension() {

}

//https://play.kotlinlang.org/byExample/04_functional/03_extensionFunctions
data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2

fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

//commaDelimitedItemNames is the Extension property in Order Data class
val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.map { it.name }.joinToString()

fun main() {
    "Dummy String".hello();

    val name: String = ""
    name.hello()
    println("extension functions".toHeading1())

    var order = Order(listOf(Item("chips", 30.0f),
        Item("wine", 120.0f),
        Item("Water", 10.0f)))
    println("The maximum prices item Name"+ order.maxPricedItemName() + "Value: " + order.maxPricedItemValue())
    println(order.commaDelimitedItemNames)
}