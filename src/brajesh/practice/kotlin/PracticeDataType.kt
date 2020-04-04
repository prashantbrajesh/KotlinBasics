package brajesh.practice.kotlin

import java.util.*

fun main() {

    val charInt = 62
    val char = charInt.toChar()
    println("$char is $charInt")

    val names = arrayOf("sds", "sdsd", "saa")
    val long = arrayOf(1L, 2L, 3L)
    println(long is Array<Long>)

    val evenNumbers = Array(16) { i -> i * 2 }
    println(Arrays.toString(evenNumbers))
    for (num in evenNumbers) {
        println(num)
    }

    val lotsofNuber = Array(10000) { i -> i + 1 }
    val allZeros = Array(100) { 0 }
    // val can be assigned only once

    val mixedArray = arrayOf("sds", 'a', 2)
    println(Arrays.toString(mixedArray))
//    println(mixedArray is Array<Any>)

    val intArrayof = intArrayOf(1, 3, 55)

    val str4 = intArrayof as? String ?: " it was null"
    println(str4)

    val str: String? = null
    str?.toUpperCase()
    println("what happen whe we do this ${str?.toUpperCase()}")

    // alvis operator
    val str2: String = str ?: "this is default value"
    println(str2)

}
