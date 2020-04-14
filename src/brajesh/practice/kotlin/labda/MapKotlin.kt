package brajesh.practice.kotlin.labda

fun main(){

    val imuttableMap = mapOf( 22 to "baba",
                                             33 to "kaba",
                                              2 to null,
                                               222 to "hsj" )
    println(imuttableMap.filter { it.value==null })

    println(imuttableMap.javaClass)

    println("${(1000 >= 100)}")

    val a: String? =null
    println(a!!)

    println(imuttableMap.filter { it.key==2 })

    val mutableMap = mutableMapOf( 1 to "sjhkjs",
        2 to 2,
        3 to "sss"
        )
//    mutableMap.putAll(imuttableMap)
    mutableMap.plus(pair = Pair(1,"ww"))
    println(mutableMap.javaClass)
    println(mutableMap)

    for ((k,v) in mutableMap){
        println(k)
        println(v)
    }

    val car = Car("blue",33)
    val (color, price) = car
    println("$color $price")

}

//destructuring the object

data class Car(val color:String, val price:Int)
