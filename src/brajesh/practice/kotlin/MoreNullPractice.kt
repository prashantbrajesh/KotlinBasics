package brajesh.practice.kotlin

import java.util.*

fun main(){

    // Safe operator !!

    val str:String? = "This is't null"
    val str4 = str!!.toUpperCase()
    println(str4)
    str?.toUpperCase()

    val str2:String? = null

    // let it do if not null
    str2?.let { printText(str2) }

    // == works with null value too
    println(str2=="its null")

    val nullableInts = arrayOfNulls<Int?>(5)
    println(Arrays.toString(nullableInts))

    val str1 = str2!!
    str1.toUpperCase()
}


fun printText(text:String){
    println(text)
}
