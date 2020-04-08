package brajesh.practice.kotlin

import java.time.Year


fun main() {

    println(ObjectKeyWordPractice.getTagLine())
    println(ObjectKeyWordPractice.companyYear)

    println(Department.ACCOUNTING.getDetails())
}


fun topLevelFunction():String = "its top level fun called from another module"

// singleton object
object ObjectKeyWordPractice {

    val companyYear = Year.now().value
    internal fun getTagLine() = " Our company rocks $companyYear"
}

enum class Department(val fullName :String,val count: Int){
    ACCOUNTING("ac",2),HR("Human ",3);

    fun getDetails():String = "details are $fullName and count is $count"
}
