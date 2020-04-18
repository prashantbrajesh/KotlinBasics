package brajesh.practice.kotlin.labda

import java.math.BigDecimal

fun main(){

    val mixedList: List<Any> = listOf("zxcz",22.2,234.3)
    val decimalList = getElementsOfType<Double>(mixedList)
    println(22.2.javaClass)
    println(decimalList)
}

inline fun <reified T> getElementsOfType(list :List<Any>):List<T>{

    val newList: MutableList<T> = mutableListOf()
    for (e in list){
        if(e is T){
            newList.add(e)
        }
    }
    return newList
}
