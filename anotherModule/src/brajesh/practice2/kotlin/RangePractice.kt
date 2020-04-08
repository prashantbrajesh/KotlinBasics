package brajesh.practice2.kotlin

fun main() {

    val range = 1..5
    val carRange = 'a'..'z'
    val stringrange = "aab".."zab"
    val stringRange2 = "aa".."zz"
    val longRange =1L..6L

    val backwardrange = 5.downTo(1)
    val stepRange = range.step(3)
    val reverse = stepRange.reversed()
    for (i in reverse)
        print(i)

    for (l in arrayOf(22,1,33).indices){
        println(" eleiment at $l ")
    }
    arrayOf(22,1,33).forEach { print(it) }
    arrayOf(22,1,33).forEachIndexed { i,a -> println( "at i $i is $a") }


    val status = 3 !in range
    println(status)
    for (i in carRange)
        print(i)

    for (i in longRange)
        print(i)

    for (i in 1..20 step 2){
        println(i)
    }
    for (i in 5 downTo 0 step 3){
        print(i)
    }

    println(3 in range)
    println('k' in carRange)
    println("aa" in stringrange)

    println(3 in backwardrange)


}
