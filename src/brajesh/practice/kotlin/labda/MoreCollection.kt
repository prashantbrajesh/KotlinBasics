package brajesh.practice.kotlin.labda

fun main(){

    val carMap = mutableMapOf<Int,Car>( 1 to  Car(color = "red",price = 22),
        3 to  Car(color = "red",price = 21),
        33 to  Car(color = "red",price = 22),
        12 to  Car(color = "red",price = 222),
        12 to  Car(color = "blue",price = 222)
    )

    println(carMap.filter { it.value.price > 22 })
    println(carMap.toSortedMap())
    println(carMap.any { it.value.price>200 })
    println(carMap.any { it.value.price>2200 })
    println(carMap.count { it.value.price>2200 })
    var car = carMap.map { it.value }
    println(car.find { it.price<200 })
    println(car.groupBy { it.color })
    println(car.sortedBy { it.price })
}

