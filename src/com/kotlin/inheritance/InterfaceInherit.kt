package com.kotlin.inheritance

interface Interface1 {
    fun whoAmI() {
        print("I'm Interface 1")
    }
}

interface Interface2 {
    fun whoAmI() {
        print("I'm Interface 2")
    }
}

class InterfaceImpl() : Interface1, Interface2 {
    override fun whoAmI() {
        super<Interface2>.whoAmI()
    }

}

fun main() {
    var intImpl = InterfaceImpl()
    intImpl.whoAmI()
}