package brajesh.practice.kotlin.labda

import java.lang.StringBuilder

data class BrajeshPair<out A,out B>(val a:A, val b:B){

    override fun toString(): String {
        return "($a, $b)"
    }
}


fun main(){


//    println(print1to100())
//    println(print1to100With())
//
//    for (i in 1..10){
//        print(i)
//    }
//    println()
    val list = listOf(1,2,3,4)
    // can convert to mutable list
    list.toMutableList().add(1)

    val bPair = BrajeshPair(1,3)
    val bPairSring = BrajeshPair("dshd","myone")
    println(bPair)
    println(bPairSring)

    val listMutable = mutableListOf(1,2,3,4,5,6,6,0)

    // ZIP
    println(list.zip(listMutable))
    // combine with plus
    println(list + listMutable)
    // union remove duplicates
    println(list.union(listMutable))
    //other way
    println((list + listMutable).distinct())



    println(System.identityHashCode(listMutable))
     // last element
    println(list.last())
    // reversed
    println(list.asReversed())
    println(list.reversed())

    // get at any index
    println(list.getOrNull(7))
    println(list.max())


    listMutable[0]=22
    println(System.identityHashCode(listMutable))

    println(listMutable)
    println(list)
    println(list.javaClass)
    println(list::class)
    println(listMutable.javaClass)
    println(listMutable::class)
    val notNull = listOfNotNull(1,2,3,null)
    println(notNull.javaClass)

//    println(list.minBy { it })

    // more about label in kotlin
    "Some thing".apply someString@ {
        "more".apply {
            println(toUpperCase())
            println( this@someString.toUpperCase())
        }
    }

    returnFromLambda()




}

// LABELED
// Labeled  return  forEach returnBlock@
fun returnFromLambda(){
    listOf(1,2,3,4,5).forEach returnBlock@{
        println("$it found")
        if(it<4){
            println("$it exiting")
            return@returnBlock
        }
        println("outer loop $it")
            return
    }
}

// apply
fun print1to100() = StringBuilder().apply {
    for(i in 1..99 ){
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }

// with
fun print1to100With() = with(StringBuilder()) {
    for(i in 1..49 ){
            append(i)
            append(", ")
        }
        append(50)
        toString()
    }
