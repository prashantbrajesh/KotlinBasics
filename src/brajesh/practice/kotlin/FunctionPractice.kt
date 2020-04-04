package brajesh.practice.kotlin

// every thing is public final by default in kotlin

fun main(): Unit {

    println(lableMultiply(3, 6))
    println(whatever())

    val car = Car("red", "tata", 2019)
    val car1 = Car("blue", "tata", 2019)
    val car2 = Car("green", "tata", 2019)
    printCarColors(car, car1, car2, str = "sds")

    // uses vararg collection type
    val numbers = arrayOf(1, 2, 3)
    val mycars = arrayOf(car, car1, car2)

    // * SPREAD OPERATOR unpack the array
    printCarColors(*mycars, str = "dsds")
    val morecars = arrayOf(car, *mycars)
    for (car in morecars) {
        print(car.color)
    }
    println()
    println("my name".myExtention())
}

// extension function String is receiver class
fun String.myExtention(): String {
    //this.toUpperCase()
    return toUpperCase()
}


// vararg preferred to be in end
fun printCarColors(vararg cars: Car, str: String) {
    for (car in cars) {
        println(car.color)
    }
}

fun whatever() = 1 * 2
// block body

// expression body
//fun lableMultiply(op1: Int, op2: Int, label: String = "The answer is")
inline fun lableMultiply(op1: Int, op2: Int, label: String = "The answer is") =
    "$label ${op1 * op2}"

// named argument



