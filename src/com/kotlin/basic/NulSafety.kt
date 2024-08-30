package com.kotlin.basic

import com.kotlin.classes.Address
import com.kotlin.classes.Customer


class Nullify {
    var message: String? = null
}

fun main() {
    var nullify = Nullify()
    println(nullify.message?.length)
 //   println(nullify.message!!.length)//Runtime NPE

    var nullCusRaj = Customer(1, "Raj", phone="")
    println("Print customer "+ nullCusRaj?.address?.toString())

    var cusRaj = Customer(1, "Raj",
        address = Address("10", "Adams road", "1HW QP"), phone = "")
      println("Print customer "+ cusRaj?.address?.toString())
}