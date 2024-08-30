
open class Car {

    open fun name() {

    }
}

open class TataCar: Car {
    override fun name() {
        super.name()
    }

    final fun fuelType(): String {
        return "Petrol"
    }

    //To call the base class constructor
    constructor(): super() {}
}

class CurveEV : TataCar() {
    override fun name() {
        print("Tata Curve")
    }
}

//Inheritance on data class is allowed from Kotlin 1.1
data class Punch(var name:String, var electric: Boolean): TataCar()
fun main(args: Array<String>) {
    var car = TataCar()
}