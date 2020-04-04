package brajesh.practice.kotlin


fun main() {
    val printer = LeaserPrinter("Cannon123")

    printer.printModel()
    println(printer.bestSellingprice())

}

// abstract no open required
abstract class Printer(val modelName: String) {

    open fun printModel() = println("modal name of printer $modelName}")

    abstract fun bestSellingprice(): Double
}

open class LeaserPrinter(modelName: String) : Printer(modelName) {
// cant be overridden into child class
    final override fun printModel() = println("leaser printer model name is $modelName")

    override fun bestSellingprice() = 122.999

}

class SpecialLeaserPrinter(modelName: String): LeaserPrinter(modelName  ){

}

class SomeThing():MySubInterface{

    override val number: Int = 23

    override fun mySubFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(st: String): String {
        TODO("Not yet implemented")
    }

}


interface  MyInterface{
    val number:Int
    fun myFunction(st: String):String
}

interface MySubInterface: MyInterface{
    fun mySubFunction(str:String):String
}
