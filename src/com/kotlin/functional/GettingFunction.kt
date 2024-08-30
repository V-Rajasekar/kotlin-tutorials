
fun operation(x: Int, y:Int, op: (Int, Int) -> Int): Int {
   return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit) {
}

fun unaryOperator(x: Int, op:(Int) -> Int): Int { return op(x) }
fun sum(x: Int, y:Int ): Int {
    return x + y
}

fun mul(x:Int, y:Int):Int = x * y

fun printSquare(x: Int) {
    println(x * x)
}


fun transaction(db: Database, code: () -> Unit) {

    try {
        code()
     //perform the code operation
    } finally {
        db.close()
    }
}

class Database {
    fun close() {}
}

fun main() {

    println("Sum Of(10, 20): " + operation(10, 20, ::sum))
    println("Sum Of(10, 20): " + operation(10, 20, { x, y -> x + y }))

    println("Mul of(10, 20): " + operation(10, 20, ::mul))
    var result = operation(10) { x ->
        (x * x)
    }
    println(result)

    println("unaryOperator: "+ unaryOperator(10) { x -> x * x })

    println("Short unaryOperator: "+ unaryOperator(5) { it * it })

    /**
     * Creating a domain specific language (DSL). Here transaction is a mini DSL to perform operation on
     * the given DB, and then close the DB connection. Note we have used the special function(Code) which takes no
     * arguments, and return nothing.
     */

    val db = Database()
    transaction(db) {
        //Interation with the database
    }

    /*Creating an anonymous function
    * With this type function you can define the param and return type, as well as multiple return
    * endpoint, which is not allowed in Lambda expression
     */
    unaryOperator(10, fun(x:Int):Int {return x * x})
}