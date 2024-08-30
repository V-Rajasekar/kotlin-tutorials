package com.kotlin.functional

fun unaryOperator(x: Int, op: (Int) -> Int):Int {
    return op(x)
}

/**
 * Closure: A closure is a function or a lambda expression that captures the variables from its surrounding scope.
 * In this case, the lambda { x -> x * num } captures the variable num from the outsideFunction scope.
 */
fun outsideFunction() {
    val num = 10
    println("Running outFunction" +  unaryOperator(10) { x -> x * num })
}
fun main() {

    outsideFunction()
}
