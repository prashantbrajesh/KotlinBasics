package brajesh.practice2.kotlin


// use of as keyword
import brajesh.practice.kotlin.ObjectKeyWordPractice
import brajesh.practice.kotlin.topLevelFunction as TPFunction

fun main() {
    val topLevelFunction = TPFunction()
    println(topLevelFunction)

    ObjectKeyWordPractice.companyYear
   // ObjectKeyWordPractice.getTagLine not accessible in another module as its is internal

}
