package brajesh.practice.kotlin

fun main(args: Array<String>) {
    println("Hello World!")
    val funct = passParam(22,null)
    println(funct)

    val customer1 = Customer(22,"baba")
    val customer2 = Customer(22,"baba")
    customer1.age = 22
    println(customer1==customer2) // by value
    println(customer1===customer2) // by reference

    val array = arrayListOf("mw","to")
    println(array[0])

    val a = 0x00101
    println(a and 0)
    println(0x001)

    // any like object and is instance of check
    val someThing : Any
    someThing = customer1
    someThing.toString()
    if(someThing is Customer)
        println(someThing.age)
}


fun passParam(size : Int, name : String?="ehrjh"): Int {
    print( "$size kk $name")
    return size
}

fun testVariableDeclaration() {
    val a: Int
    val b = "asjdfsk"
    val c: Int = 23 // int of no use
    val d: Short = 11 // Short required

}
// no for loop
// no static key word
// String.length

class Customer(var age: Int,val name: String){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Customer

        if (age != other.age) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = age
        result = 31 * result + name.hashCode()
        return result
    }
}
