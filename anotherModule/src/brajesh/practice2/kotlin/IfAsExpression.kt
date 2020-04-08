package brajesh.practice2.kotlin

fun main() {

    print(" if ${ if(1>2) 33 else 3 }")


    val a =2
    val b =33
    val result = when{
        a>b -> "a is grater b"
        a<b -> "a is less b"
        a==b -> "a is equall b"
        else -> "not possible"
    }

    println(result)

    returnNothing()
}


fun returnNothing():Nothing{
    throw IllegalAccessError("should not access")
}
