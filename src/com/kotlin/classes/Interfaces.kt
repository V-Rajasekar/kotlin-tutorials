package com.kotlin.classes

data class Account(var accountNumber:Int, var name: String)
interface AccountRepository {

    val isActive: Boolean
        get() = false

    fun store(obj:Account) {

    }

    fun getByAccountNumber(id: Int): Account
}

class HDFCAccount: AccountRepository {

    override val isActive: Boolean = true
    override fun getByAccountNumber(id: Int): Account {
        TODO("Not yet implemented")
    }
}

fun main() {
    var hdfcAccount = HDFCAccount()
    println("HDFC Account isActive: " + hdfcAccount.isActive);
}