package com.kotlin.classes

/**
 * Objects provide an easy way to create a Singleton object.
 */
object Global {
  //read only property
    val CITIZEN = "INDIAN"
}

fun main(args: Array<String>) {
    val localObj = object {
        val CITIZEN = "TAMILAN"
    }

    println(Global.CITIZEN)
    println(localObj.CITIZEN)
}