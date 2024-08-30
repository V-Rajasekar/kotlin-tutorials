package com.kotlin.classes

import java.io.IOException

data class Address(var houseNo: String, var street: String, var zipCode: String)
data class Customer(var id: Int, var name: String, var email:String = "default@gmail.com", var address: Address? = null, val phone:String?) {

    //JVMField allow us to access a propery as if we were accessing the field from Java.
    @JvmField val loyaltyCustomer = "LOYID"
    override fun toString(): String {
        return "{\"id\": \"$id\",\"name\": \"$name\", \"email\":  \"$email\"}"
    }

    @JvmOverloads fun changeStatus(status: Status = Status.IN_ACTIVE) {

    }

     @JvmName("preferentials") fun makePreferred() {

    }

    /***
     * In Kotlin there is no concept of throwing checked exception, so when this method is called
     * from the Java, this checkException throw IOException has to be handled, so support handling checked
     * exception in java @Throws annotation is used here. {@link com.kotlin.basic.TalkingKotlinFromJava#main}
     */

    @Throws(IOException::class) fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("No file found")
        }
    }
}

enum class Status {
    ACTIVE, IN_ACTIVE
}

enum class BeverageCup(val value: Int) {
    SMALL(100) {
        override fun text(): String {
            return ("[SMALL Cup]")
        }
    },
    Medium(250) {
        override fun text(): String {
            TODO("Not yet implemented")
        }
    },
    Large(500) {
        override fun text(): String {
            TODO("Not yet implemented")
        }

        override fun toString(): String {
            return "Large Cup. Are you ok ?"
        }
    };
    abstract fun text(): String
}

fun main(args: Array<String>) {
    var cusRaj = Customer(1, "Raj", phone=null)
    var cusSundar = Customer(1, "Sundar", "sundar@gmail.com", phone="486734390")
   println(cusRaj)
    println(cusSundar)

   val beverageCup = BeverageCup.Medium

   println("Cup size: $beverageCup")
    println("Cup ml:" + beverageCup.value)
    println("Medium toString():" + beverageCup.toString())
    val beverageSmall = BeverageCup.SMALL
    println(beverageSmall.text() +  " Ordinal/" +beverageSmall.ordinal + " Name/"+ beverageSmall.name + " Value/"+ beverageSmall.value )
    println("----All cups---")
    for (cup in BeverageCup.values()) {
        println(cup)
    }
}