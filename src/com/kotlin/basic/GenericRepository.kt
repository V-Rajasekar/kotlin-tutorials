package com.kotlin.basic

import com.kotlin.classes.Customer

interface Repository<T> {
    fun store(obj:T)
    fun getById(id: Int): T
}

class GenericRepository<T>: Repository<T> {
    override fun store(obj: T) {
        TODO("Not yet implemented")
    }

    override fun getById(id: Int): T {
        TODO("Not yet implemented")
    }
}

interface  Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
}

class RepoImpl: Repo {
    override fun <T> getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun <L> getAll(): List<L> {
        TODO("Not yet implemented")
    }

}
fun main() {
    var cusRepository = GenericRepository<Customer>()
    var customer = cusRepository.getById(1)

    var repo = RepoImpl()
    var customerObj = repo.getById<Customer>(1)
    }