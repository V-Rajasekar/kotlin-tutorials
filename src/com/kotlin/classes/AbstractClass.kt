package com.kotlin.classes

abstract class Pass {

    var status: Boolean = true

    abstract fun passExpiry(): String

    fun getPassStatus(): String {
        return status.toString()
    }

}

class RuterPass() : Pass() {
    override fun passExpiry():String {
        return "2034-08-31"
    }
}

fun main(args: Array<String>) {
    var ruterPass = RuterPass()
    ruterPass.status = false
    println("Pass status: "+ ruterPass.getPassStatus()+ " - " + ruterPass
            + " Pass expiry:" + ruterPass.passExpiry())
}