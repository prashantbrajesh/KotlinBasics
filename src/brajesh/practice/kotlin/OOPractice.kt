package brajesh.practice.kotlin


val MY_CONSTANTS = 100


// internal in kotlin access modifier

// default return is Unit
fun main():Unit {

    val car = Car("blue","Honda",2019)
    val car2 = Car("blue","Honda",2019)
    println(car)
    println(car==car2)
    val car3 = car.copy()
    val car4 = car.copy(year = 1991)
    println(car3)
    println(car4)


    println(MY_CONSTANTS)
    val emp = Employee("Brajesh")
    println(emp.firstName)
    println(emp.fullTime)

    val emp1 = Employee("Test2", false)


    emp1.fullTime = true
    printText(emp1.fullTime.toString())
}

data class Car(val color: String, val model: String, val year: Int) {

}

// all class are public and final Long Way
//class Employee protected constructor(val firstName: String)
class Employee(val firstName: String, fullTime: Boolean = true) {
//    val firstName: String = firstName

    //    init {
//        this.firstName = firstName
//    }
    // custome det and set
    var fullTime = fullTime
        get() {
            println("running custom get")
            return field
        }
        set(value) {
            println("running custome set")
            field = value

        }


    /*   var fulltime = true

       // secondary constructor don't declare property
       constructor(firstName: String, fulltime: Boolean) : this(firstName) {
           this.fulltime = fulltime
       }*/
}
